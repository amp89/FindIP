package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import data.CurrentUser;

@RestController
@SessionAttributes({"currentUserLogin"})
public class IpRestController {

	//TODO this is a test moethod, however it if is usefull i will leave it
	@RequestMapping(value="/getLoggedInUserData")
	private CurrentUser getLoggedInUserData(HttpSession session){
		CurrentUser currentUserLogin = (CurrentUser) session.getAttribute("currentUserLogin");
		System.out.println("Rest Controller.  currentUserLogin: " + currentUserLogin);
		return currentUserLogin;
		
		
		
	}//getLoggedInUserData
	
}