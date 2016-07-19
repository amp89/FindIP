package data;

import entities.Address;
import entities.Save;
import entities.User;

public interface IpDAO {

	// TestMethods
	public CurrentUser getTestUser(); // TODO test method

	// USER
	// authenticate
	public CurrentUser authenticateUser(UserLoginObject user);
	// check missed loggins and authenticate

	// user session data
	// get saves TODO nevermind -  this is attached to the CurrentUser, which is attached
	// to the session
	public String confirmUserAccount(User user); 
	
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
	//remove all saves
	//remove the user

	// IP SEARCH

	// search
	public Address getIpStats(String ipAddress);
	
	//get public comments for an address
	public String getIpPublicComments(Integer addressId);

}
