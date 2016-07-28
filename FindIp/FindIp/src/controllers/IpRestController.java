package controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.CurrentUser;
import data.DeleteSavePostObject;
import data.IpDAO;
import data.IpSaveObject;
import data.IpSearchObject;
import data.RestMessageObject;
import data.UserLoginObject;
import entities.Address;

@RestController
// @SessionAttributes({"currentUserLogin"})
public class IpRestController {

	@Autowired
	private IpDAO dao;



	// TODO test method, remove.
	@RequestMapping(value = "/testRestPath", method = RequestMethod.GET, produces = "application/json")
	private CurrentUser testRestPath() {
		return dao.getTestUser();
	}

	// TODO test method, remove
	@RequestMapping(value = "/testPostPath", method = RequestMethod.POST, produces = "application/json")
	private String testPostPath(@RequestBody UserLoginObject ulo) {
		System.out.println(ulo);
		return "{\"did it work????\":\"yesss\"}";
	}

	@RequestMapping(value = "/getIpData", method = RequestMethod.POST, produces = "application/json")
	private Address getIpData(HttpSession session, @RequestBody IpSearchObject ipso) {
		System.out.println("Search params: " + ipso); // TODO debug printout
														// only
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		// System.out.println("USER TOKEN: " + cu.getAccessToken()); TODO remove
		// System.out.println("REST TOKEN: " + ipso.getAccessToken()); TODO
		// remove
		if ((cu != null && ipso != null) && cu.getAccessToken().equals(ipso.getAccessToken())) {
			Address ipAddress = dao.getIpStats(ipso);
			return ipAddress;
		} else {
			System.out.println("INVALID ACCESS TOKEN"); // TODO remove -
														// VALIDATED - THIS
														// WORKS
			return null;
		}
	}// end getIpData();

	@RequestMapping(value = "/saveIp", method = RequestMethod.POST, produces = "application/json")
	private RestMessageObject saveIpAddress(HttpSession session, @RequestBody IpSaveObject ipso) {
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		// make sure data is valid & access token is valid
		System.out.println("save" + ipso); // TODO remove
		System.out.println("user: " + cu);
		if (cu != null) {
			if ((ipso.getPrivateComment() == null || (ipso.getPrivateComment().length() < 10000)
					&& (ipso.getPublicComment() == null || ipso.getPublicComment().length() < 10000))
					&& ipso.getAccessToken().equals(cu.getAccessToken())) {
				dao.saveIpAddress(ipso, cu.getId());
				System.out.println("saved"); // TODO remove
				//update user list by logging out and back in.
				refreshUser(session);
				
				return new RestMessageObject("Item Saved!");
			}
		}
		return new RestMessageObject("Did not work.  Try again later");
		
	}//saveIpAddress
	
	@RequestMapping(value = "/deleteSave", method = RequestMethod.POST, produces = "application/json")
	private RestMessageObject deleteSave(HttpSession session, @RequestBody DeleteSavePostObject dspo){
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		// make sure data is valid & access token is valid
		System.out.println("save" + dspo); // TODO remove
		System.out.println("user: " + cu);
		if (cu != null && dspo.getAccessToken().equals(cu.getAccessToken()) && (dspo.getUserId() == cu.getId())) {
			dao.deleteSave(dspo);
			//update user list
			refreshUser(session);
		}
		return new RestMessageObject("Did not work.  Try again later");
		
	}//saveIpAddress
	
	//get public comments
	@RequestMapping(value = "/getPublicComments/{addressId}/{accessToken}", method = RequestMethod.GET, produces= "application/json")
	private List<String> getPublicComments(HttpSession session, @PathVariable Integer addressId, @PathVariable String accessToken){
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		if(cu != null && cu.getAccessToken().equals(accessToken)){
			System.out.println("returning " + dao.getIpPublicComments(addressId)); //TODO remove
			return dao.getIpPublicComments(addressId);
		}else{
			System.out.println("no comments found?"); //TODO remove
			return null;
		}
	
	}
//	
	
	private void refreshUser(HttpSession session){
		CurrentUser cu = (CurrentUser)session.getAttribute("currentUserLogin");
		String accessToken = cu.getAccessToken();
		session.setAttribute("currentUserLogin",null);
		cu = dao.getUserById(cu.getId());
		cu.setAccessToken(accessToken);
		session.setAttribute("currentUserLogin",cu);
	}
		
}//end class


