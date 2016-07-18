package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.CurrentUser;
import data.IpDAO;

@RestController
//@SessionAttributes({"currentUserLogin"})
public class IpRestController{

	@Autowired
	private IpDAO dao;
	
	//TODO this is a test moethod, however it if is usefull i will leave it
	@RequestMapping(value="/getLoggedInUserData", method=RequestMethod.GET, produces = "application/json")
	private CurrentUser getLoggedInUserData(HttpSession session){
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		System.out.println("Rest Controller.  currentUserLogin: " + cu);

		return cu;
//		return "{\"TEST\":\"DATAAAAAA\"}";
		
	}//getLoggedInUserData
	
	//TEST
	@RequestMapping(value="/testRestPath", method=RequestMethod.GET, produces = "application/json")
	private CurrentUser testRestPath(){
		return dao.getTestUser();
	}
	
}
