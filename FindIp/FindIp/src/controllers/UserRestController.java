package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.CurrentUser;

@RestController
public class UserRestController {

	
	// TODO this is a test moethod, however it if is usefull i will leave it
	@RequestMapping(value = "/getLoggedInUserData", method = RequestMethod.GET, produces = "application/json")
	private CurrentUser getLoggedInUserData(HttpSession session) {
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		System.out.println("Rest Controller.  currentUserLogin: " + cu);

		return cu;
		// return "{\"TEST\":\"DATAAAAAA\"}";

	}// getLoggedInUserData
	
}
