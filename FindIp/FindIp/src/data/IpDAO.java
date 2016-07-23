package data;

import java.util.List;

import entities.Address;
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
	public String saveIpAddress(IpSaveObject save, Integer userId);
	
	public String deleteSave(DeleteSavePostObject dspo);

	// get user by:
	// id
	public CurrentUser getUserById(Integer id);

	// email
	public List<User> getUsersByEmail(String email);

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
	public Address getIpStats(IpSearchObject ipso);
	
	//get public comments for an address
	public List<String> getIpPublicComments(Integer addressId);

}
