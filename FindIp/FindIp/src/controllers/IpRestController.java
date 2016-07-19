package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.CurrentUser;
import data.IpDAO;
import data.IpSearchObject;
import data.UserLoginObject;
import entities.Address;

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
	
	//TODO test method, remove.
	@RequestMapping(value="/testRestPath", method=RequestMethod.GET, produces = "application/json")
	private CurrentUser testRestPath(){
		return dao.getTestUser();
	}
	

	
	
	
	//TODO test method, remove
	@RequestMapping(value="/testPostPath", method=RequestMethod.POST,produces = "application/json")
	private String testPostPath(@RequestBody UserLoginObject ulo){
		System.out.println(ulo);
		return "{\"did it work????\":\"yesss\"}";
	}
	
	@RequestMapping(value="/getIpData", method=RequestMethod.POST, produces = "application/json")
	private Address getIpData(@RequestBody IpSearchObject ipso){
		System.out.println(ipso);
		return null;
	}
	
	
	
}
