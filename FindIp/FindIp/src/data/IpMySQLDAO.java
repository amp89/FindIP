package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dataHelpers.AddressDataHelper;
import dataHelpers.SaveDataHelper;
import dataHelpers.UserDataHelper;
import entities.Address;
import entities.Save;
import entities.User;

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
		Save save = SaveDataHelper.convertIpSaveObjectToSave(saveObject);
		System.out.println(save); //TODO remove
		em.persist(save);
		return "Saved";
		

	}

	// get user by:
	// id
	public User getUserById() {
		return null;
	}

	// email
	public User getuserByEmail() {
		return null;
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
		return addressResultList.get(1);
	}

	// get public comments for an address
	public String getIpPublicComments(Integer addressId) {
		return null;
	}

}
