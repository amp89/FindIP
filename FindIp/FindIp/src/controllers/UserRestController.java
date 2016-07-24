package controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import controllerHelper.UserControllerHelper;
import data.CurrentUser;
import data.IpDAO;
import data.RestMessageObject;
import data.UserEditObject;
import entities.User;

@RestController
public class UserRestController {

	@Autowired
	private IpDAO dao;


	// TODO this is a test moethod, however it if is usefull i will leave it
	@RequestMapping(value = "/getLoggedInUserData/{accessToken}", method = RequestMethod.GET, produces = "application/json")
	private CurrentUser getLoggedInUserData(HttpSession session, @PathVariable String accessToken) {
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		System.out.println("A TOKEN : " + accessToken);
		System.out.println("Rest Controller.  currentUserLogin: " + cu); //TODO remove
		if(cu != null && cu.getAccessToken().equals(accessToken)){
			return cu;
		}else{
			return null;
		}

		// return "{\"TEST\":\"DATAAAAAA\"}";

	}// getLoggedInUserData
	
	//get's another user's information, works for admin only
	@RequestMapping(value = "/getUserData/{returnUserId}/{accessToken}", method = RequestMethod.GET, produces = "application/json")
	private User getUserData(HttpSession session, @PathVariable int returnUserId, @PathVariable String accessToken) {
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		System.out.println("A TOKEN : " + accessToken);
		System.out.println("Rest Controller.  currentUserLogin: " + cu); //TODO remove
		if((cu != null && cu.getAccessToken().equals(accessToken))  && cu.getUserType().getAccessLevel() >= 2){
			return dao.getFullUserById(returnUserId);
		}else{
			return null;
		}
		
		// return "{\"TEST\":\"DATAAAAAA\"}";
		
	}// getLoggedInUserData
	
	
	//admin user add
	
	//search for users
	
	//TODO combine two search method logic into a non-request mapped method for simplicity:
	@RequestMapping(value = "/searchUsers/{emailSearched}/{accessToken}", method = RequestMethod.GET, produces = "application/json")
	private List<User> searchUsers(@PathVariable String emailSearched, @PathVariable String accessToken, HttpSession session){
		System.out.println("search: " + emailSearched); //TODO remove
		System.out.println("a token: " + accessToken); //TODO remove
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		if(UserControllerHelper.checkIfUserValid(cu, accessToken)){
			//lookup users
			List<User> userList =  dao.getUsersByEmail(emailSearched);
			for (User user : userList) { //TODO remove this loop
				System.out.println(user);
			}
			return userList;
		}else{
			return null;
		}

	}	
	@RequestMapping(value = "/searchUsers/{accessToken}", method = RequestMethod.GET, produces = "application/json")
	private List<User> searchUsers(@PathVariable String accessToken, HttpSession session){
		System.out.println("a token: " + accessToken); //TODO remove
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		if(UserControllerHelper.checkIfUserValid(cu, accessToken)){
			//lookup users
			List<User> userList =  dao.getUsersByEmail("");
			for (User user : userList) { //TODO remove this loop
				System.out.println(user);
			}
			return userList;
		}else{
			return null;
		}
		
	}//search users
	
	@RequestMapping(value="/editUser", method=RequestMethod.POST, produces = "application/json")
	private RestMessageObject searchUsers(@RequestBody UserEditObject userToEdit, HttpSession session){
		System.out.println("user to edit: " + userToEdit);  //TODO remove
		dao.updateUser(userToEdit);
		//make sure to read access level for user type, and set accordingly.  keep this comment.
		
		return null; //TODO change to usefull message
		
	}
	
	
	//delete user
	@RequestMapping(value="/delete", method=RequestMethod.POST, produces = "application/json")
	private RestMessageObject deleteuser(@RequestBody UserEditObject userToEdit, HttpSession session){
		System.out.println("user to delete: " + userToEdit); //TODO remove
		
		
		//make sure to read access level for user type, and set accordingly.  keep this comment.
		
		return null; //TODO change to usefull message
		
	}
	
	//admin delete user
	
	
}
