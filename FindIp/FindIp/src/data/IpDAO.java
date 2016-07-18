package data;

import entities.Save;
import entities.User;

public interface IpDAO {

	// TestMethods
	public CurrentUser getTestUser(); // TODO test method

	// USER
	// authenticate
	public CurrentUser authenticateUser(User user);
	// check missed loggins and authenticate

	// user session data
	// get saves TODO no this is attached to the CurrentUser, which is attached
	// to the session

	// create save
	public String saveIpAddress(Save save, Integer userId);

	// get user by:
	// id
	public User getUserById();

	// email
	public User getuserByEmail();

	// failed login's
	public User getUserByFailedLogginAttempts();

	// add user:

	// add by admin
	public String adminAddUser(User user);

	// add by signup
	public String signUp(User user);
	// send confirmation email (make it norepy-findip@alexmpeterson.com)

	// update user:

	// update
	public String updateUser(User user);

	// delete user:

	// remove
	public String removeUser(Integer userId);

	// IP SEARCH

	// search
	public String getIpStats(Integer ipAddress);

}
