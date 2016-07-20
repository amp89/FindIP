package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.CurrentUser;
import data.IpDAO;
import data.IpSaveObject;
import data.IpSearchObject;
import data.RestMessageObject;
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
	private Address getIpData(HttpSession session, @RequestBody IpSearchObject ipso){
		System.out.println("Search params: " + ipso); //TODO debug printout only
		CurrentUser cu = (CurrentUser)session.getAttribute("currentUserLogin");
//		System.out.println("USER TOKEN: " + cu.getAccessToken()); TODO remove
//		System.out.println("REST TOKEN: " + ipso.getAccessToken()); TODO remove
		if(cu.getAccessToken().equals(ipso.getAccessToken())){
			Address ipAddress = dao.getIpStats(ipso);
			return ipAddress;
		}
		//This shouldn't ever happen because of angular validation on the front end
		else{
			System.out.println("INVALID"); //TODO remove
			return null;
		}
	}// end getIpData();
	
	@RequestMapping(value="/saveIp", method=RequestMethod.POST, produces = "application/json")
	public RestMessageObject saveIpAddress(HttpSession session, @RequestBody IpSaveObject ipso){
		CurrentUser cu = (CurrentUser)session.getAttribute("currentUserLogin");
		//make sure data is valid & access token is valid
		if(ipso.getPrivateComment().length() < 10000 && ipso.getPublicComment().length() < 10000
				&& ipso.getAccessToken().equals(cu.getAccessToken())){
			dao.saveIpAddress(ipso, cu.getId());
			System.out.println("saved"); //TODO remove
			return new RestMessageObject("Item Saved!");
		}else{
			return new RestMessageObject("Item not Saved, Try again later.");
		}
	}
	
	
	
}
