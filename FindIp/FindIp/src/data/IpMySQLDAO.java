package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import dataHelpers.AddressDataHelper;
import dataHelpers.SaveDataHelper;
import dataHelpers.UserDataHelper;
import entities.Address;
import entities.Save;
import entities.User;

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
	public String signUp(User user) {
		//check for exsisting email
		return null;
	}
	// send confirmation email (make it norepy-findip@alexmpeterson.com)

	// update user:

	// update
	public String updateUser(User user) {
		return null;
	}

	// delete user:

	// remove
	public String removeUser(Integer userId) {
		return null;
	}
	// remove all saves
	// remove the user

	// IP SEARCH

	// search
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
