package controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import controllerHelper.UserControllerHelper;
import data.CurrentUser;
import entities.User;

@RestController
public class UserRestController {

	
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
	
	//admin user add
	
	//search for users
	@RequestMapping(value = "/searchUsers/{emailSearched}/{accessToken}", method = RequestMethod.GET, produces = "application/json")
	private List<User> searchUsers(@PathVariable String emailSearched, @PathVariable String accessToken, HttpSession session){
		System.out.println("search: " + emailSearched); //TODO remove
		System.out.println("a token: " + accessToken); //TODO remove
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		if(UserControllerHelper.checkIfUserValid(cu, accessToken)){
			//lookup users
			
			return userList;
		}else{
			return null;
		}
		
		
		
	}
	//delete user
	
	//admin delete user
	
	
}
