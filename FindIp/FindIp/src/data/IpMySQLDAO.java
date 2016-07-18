package data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dataHelpers.UserDataHelper;
import entities.Save;
import entities.User;

public class IpMySQLDAO implements IpDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public CurrentUser getTestUser() { // TODO test method

		return UserDataHelper.convertUserToCurrentUser(em.find(User.class, 1));
	}

	public CurrentUser authenticateUser(User user) {
		return null;
	}
	// check missed loggins and authenticate

	// user session data
	// get saves TODO nevermind - this is attached to the CurrentUser, which is
	// attached
	// to the session

	// create save
	public String saveIpAddress(Save save, Integer userId) {
		return null;
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
	public String getIpStats(Integer ipAddress) {
		return null;
	}

	// get public comments for an address
	public String getIpPublicComments(Integer addressId) {
		return null;
	}

}
