package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.CurrentUser;

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
	
	//delete user
	
	//admin delete user
	
	
}
