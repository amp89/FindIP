package data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import dataHelpers.AddressDataHelper;
import dataHelpers.Mailer;
import dataHelpers.SaveDataHelper;
import dataHelpers.UserDataHelper;
import entities.Address;
import entities.Save;
import entities.User;
import entities.UserType;

@Transactional
public class IpMySQLDAO implements IpDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public CurrentUser getTestUser() { // TODO test method

		return UserDataHelper.convertUserToCurrentUser(em.find(User.class, 1));
	}

	// check missed loggins and authenticate
	public CurrentUser authenticateUser(UserLoginObject user) {
		String email = user.getEmail().trim().toLowerCase();
		String password = user.getPassword().trim();
		
		User loggedIn = em.createQuery("Select u from User u WHERE LOWER(email) = LOWER(:email)",User.class).setParameter("email",email).getSingleResult();		

		//if login failed 5 times, lock account
		if(loggedIn.getFailedLogins() < 5){
			//check password
			if(loggedIn.getPassword().trim().equals(password.trim())){
				CurrentUser cu = UserDataHelper.convertUserToCurrentUser(loggedIn);
				cu.setAccountLocked(false);
				loggedIn.setFailedLogins(0);
				UserDataHelper.addAuthToken(cu);
				return cu;
			}else{
				loggedIn.setFailedLogins(loggedIn.getFailedLogins() + 1);
				return null;
			}
		}else{
			//send locked account email.
			CurrentUser cu = new CurrentUser();
			cu.setEmail(user.getEmail());
			cu.setAccountLocked(true);
			return cu;
		}
		//if login
//		return UserDataHelper.convertUserToCurrentUser(loggedIn);
	}


	// user session data
	// get saves TODO nevermind - this is attached to the CurrentUser, which is
	// attached
	// to the session
	
	@Override
	public boolean confirmUserAccount(UserLoginObject user){
		User userToConfirm = em.createQuery("Select u from User u WHERE LOWER(u.email) = LOWER(:email)"
				,User.class).setParameter("email",user.getEmail()).getSingleResult();
		
		if(userToConfirm.getConfirmation_id().equals(user.getAccessToken().trim())){
			//TODO get the user using entity manager and set type to user
			userToConfirm.setUserType(em.find(UserType.class,2));
			System.out.println("user set"); //TODO remove
			return true;
		}else{
			return false;
		}
		
	}
	
	// create save
	public String saveIpAddress(IpSaveObject saveObject, Integer userId) {
		Save save = SaveDataHelper.convertIpSaveObjectToSave(saveObject,
				em.find(User.class, saveObject.getUserId()),
				em.find(Address.class, saveObject.getIpId()));
		em.persist(save);
		return "Saved";
		//TODO stop it from saving more than once, that doens't make sense.
		

	}

	@Override
	public String deleteSave(DeleteSavePostObject dspo){
		Save save = em.find(Save.class,dspo.getSaveId());
		em.remove(save);
		return "Removed";
	}
	
	// get user by:
	// id
	@Override
	public CurrentUser getUserById(Integer id) {
		return UserDataHelper.convertUserToCurrentUser(em.find(User.class,id));
	}
	
	
	
	@Override
	public User getFullUserById(Integer id){
		return em.find(User.class,id);
	}
	
	

	// email
	@Override
	public List<User> getUsersByEmail(String email) {
		String query = "Select u from User u WHERE u.email LIKE LOWER(:email)";
		//TODO TODO TODO null pointer here on lookup
		List<User> userList = em.createQuery(query,User.class).setParameter("email","%" + email.trim().toLowerCase()+"%").getResultList();
		System.out.println(); //TODO remove
		return userList;
	}

	// failed login's
	public User getUserByFailedLogginAttempts() {
		return null;
	}

	// add user:

	// add by admin
	public String adminAddUser(User user) {
		return null;
	}

	// add by signup
	@Override
	public boolean signUp(UserLoginObject  user) {
		//check for exsisting email
		String query = "SELECT u FROM User u WHERE LOWER(u.email) = LOWER(:email)";
		String emailParam = user.getEmail();
		User userExsists = null;
		try{
			userExsists = em.createQuery(query,User.class).setParameter("email",emailParam).getSingleResult();			
		}catch(NoResultException nre){
			//This should happen
			System.out.println("does not exsist"); //TODO remove
		}
		System.out.println("results found: " + userExsists); //TODO remove
		if(userExsists != null){
			return false;
		}else{
			
			User newUser = new User(user.getEmail(),
					user.getPassword(),
					UserDataHelper.getNewConfirmationCode(),0,
					em.createQuery("SELECT ut FROM UserType ut WHERE ut.accessLevel = :accessLevel",UserType.class).setParameter("accessLevel",0).getSingleResult());

			sendSignUpMail(newUser.getEmail(), newUser.getConfirmation_id());
			
			
			em.persist(newUser);
			
			return true;
		}		
	}
	// send confirmation email (make it norepy-findip@alexmpeterson.com)

	// update user:

	// update
	@Override
	public String updateUser(UserEditObject editedUser) {
		
		User user = em.find(User.class, editedUser.getId());
		
		user.setEmail(editedUser.getEmail());
		user.setPassword(editedUser.getPassword());
		//query  in case of duplicates:
		UserType newUserType = (UserType) em.createQuery("Select ut from UserType ut WHERE ut.accessLevel = :accessLevel")
				.setParameter("accessLevel", editedUser.getAccessLevel()).getResultList().get(0);
		user.setUserType(newUserType);
		
		user.setFailedLogins(editedUser.getFailedLogins());
				
		return null; //TODO make meaningful message
	}
	
	@Override
	public String updateSelf(UserEditObject editedUser) {
		
		User user = em.find(User.class, editedUser.getId());
		
		//if email is different, resend confirmation thing.
		if(!(user.getEmail().trim().toLowerCase().equals(editedUser.getEmail().trim().toLowerCase()))){
			if(user.getUserType().getAccessLevel() < 2){
				user.setUserType(em.find(UserType.class,1));
				//TODO mailer
				String newConfId = UserDataHelper.getNewConfirmationCode();
				user.setConfirmation_id(newConfId);
				user.setEmail(editedUser.getEmail());
				sendSignUpMail(editedUser.getEmail(), newConfId);
				System.out.println("set email, non admin"); //TODO remove
			}else{
				user.setEmail(editedUser.getEmail());
				System.out.println("set email, admin"); //TODO remove
			}
		}
		
		user.setPassword(editedUser.getPassword());
		
		return null; //TODO make meaningful message
	}

	// delete user:

	// remove
	@Override
	public String removeUser(UserEditObject editedUser) {
		em.remove(em.find(User.class, editedUser.getId()));
		
		return null; //TODO meaningful message
	}
	// remove all saves
	// remove the user

	// IP SEARCH

	// search
	@Override
	public Address getIpStats(IpSearchObject ipso) {
		System.out.println("IN DAO: IPSO: " + ipso.getIpAddress());//TODO DEBUG
		Long ipNumber = AddressDataHelper.convertIpAddressToNumber(ipso.getIpAddress());
		//return a list (in case of duplicate entries), and return the first item of the list
		List<Address> addressResultList = em.createQuery("Select a from Address a WHERE"
				+ " a.startIp <= :ipNumber AND a.endIp >= :ipNumber",Address.class)
				.setParameter("ipNumber",ipNumber).getResultList();
		if(addressResultList.size() < 1){
			return null;
		}else{
			return addressResultList.get(1);
			
		}
	}
	
	@Override
	public List<SingleComment> getPublicComments(Integer addressId){
		Address a = em.find(Address.class, addressId);
		List<Save> saves = a.getSaves();
		System.out.println("DAO: address: " + a);  //TODO remove
		System.out.println("DAO: address: saves " + a.getSaves()); //TODO remove
		List<SingleComment> publicComments = new ArrayList<>();
		for (Save s : saves) {
			publicComments.add(new SingleComment(s.getPublicComment()));
		}
		return publicComments;
	}


	
	
	public void sendSignUpMail(String email, String confid){
		Mailer mailer = new Mailer(email,"IPFind Account Confirmation", ""
				+ "\nHere is your confirmation info."
				+ "\nGo to localhost:8080/FindIp/emailConfirm.do and enter your"
				+ "\ncredentials, with the following key:\n"
				+ "\n"+confid+"\n"
						+ "\nThank you for using IPFind!");
		
		mailer.sendEMail();
		
		
	}
	
	
	
	public void sendResetMail(String email, String confid){
		Mailer mailer = new Mailer(email,"IPFind Account Confirmation", ""
				+ "\nHere is your new password."
				+ "\nGo to localhost:8080/FindIp and enter your"
				+ "\ncredentials, with the following password:\n"
				+ "\n"+confid+"\n"
				+ "\nThank you for using IPFind!");
		
		mailer.sendEMail();
		
		
	}
	
	@Override
	public String resetPassword(UserEditObject userEditObject){
		User user = em.createQuery("Select u from User u where LOWER(u.email) = LOWER(:email)",User.class)
				.setParameter("email",userEditObject.getEmail()).getSingleResult();
		String newPassword = UserDataHelper.getNewConfirmationCode();
		user.setPassword(newPassword);
		user.setFailedLogins(0);
		//TODO change this to have a better way to email a password
		sendResetMail(user.getEmail(), newPassword);
		return null; //change
	}


}
