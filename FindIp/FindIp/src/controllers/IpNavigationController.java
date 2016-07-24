package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.CurrentUser;
import data.IpDAO;

@Controller
public class IpNavigationController {

	@Autowired
	private IpDAO dao;


	
	@RequestMapping(path = "search", method = RequestMethod.GET)
	private ModelAndView setUpSearch(HttpSession session) {
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		if (cu == null) {
			return new ModelAndView("redirect:/index.do");
		} else {
			return getUserAndAccessTokenMV(cu, "search");
		}
	}

	@RequestMapping(path = "userDashboard", method = RequestMethod.GET)
	private ModelAndView getUserDashboard(HttpSession session) {
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		if (cu == null) {
			return new ModelAndView("redirect:/index.do");
		} else {
			return getUserAndAccessTokenMV(cu, "dashboard");
		}
	}

	@RequestMapping(path = "manageUsers", method = RequestMethod.GET)
	private ModelAndView getManageUsers(HttpSession session) {
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		if (cu == null) {
			return new ModelAndView("redirect:/index.do");
		} else {
			if (cu.getUserType().getAccessLevel() >= 2) {
				return getUserAndAccessTokenMV(cu, "manageUsers");
			} else {
				return new ModelAndView("redirect:/userDashboard.do");
			}
		}
	}// manage users

	@RequestMapping(path = "editUserPage", method = RequestMethod.GET)
	private ModelAndView getEditUserPage(HttpSession session, @RequestParam("userToEditId") String userToEditId,
			@RequestParam("accessToken") String accessToken) {
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		System.out.println("Session user: " + cu);//TODO REMOVE, for debugging
		System.out.println("Session AT: " + cu.getAccessToken());//TODO REMOVE, for debugging
		System.out.println("Passed at: " + accessToken);//TODO REMOVE, for debugging
		System.out.println("Passed user id: " + userToEditId);//TODO REMOVE, for debugging
		if (cu == null) {
			return new ModelAndView("redirect:/index.do");
		} else if (cu.getAccessToken().equals(accessToken) && cu.getUserType().getAccessLevel() >= 2) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("user", cu);
			mv.addObject("accessToken", cu.getAccessToken());
			mv.addObject("userToEditId",Integer.parseInt(userToEditId)); //number comes in as a string
			mv.setViewName("editUser");
			return mv;

		}else{
			
			return new ModelAndView("redirect:/userDashboard.do");
		}

	}

	private ModelAndView getUserAndAccessTokenMV(CurrentUser cu, String viewName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", cu);
		mv.addObject("accessToken", cu.getAccessToken());
		mv.setViewName(viewName);
		return mv;
	}

}
