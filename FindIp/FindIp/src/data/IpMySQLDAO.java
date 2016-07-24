package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import dataHelpers.AddressDataHelper;
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
		String password = user.getPassword().trim().toLowerCase();
		
		User loggedIn = em.createQuery("Select u from User u WHERE LOWER(email) = :email",User.class).setParameter("email",email).getSingleResult();		

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
	public String confirmUserAccount(User user){
		return null;
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
			User newUser = new User();
			newUser.setEmail(user.getEmail());
			//TODO add confirmation code and stuff
			//TODO send confirmation email
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

	// get public comments for an address
	public List<String> getIpPublicComments(Integer addressId) {
		
		return null;  // i think these are included with the getIpStats method TODO remove
	}

}
