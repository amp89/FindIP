package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import data.CurrentUser;

@Controller
public class IpNavigationController {
	
	@RequestMapping(path = "search", method = RequestMethod.GET)
	private ModelAndView setUpSearch(HttpSession session){
		ModelAndView mv = new ModelAndView();
		CurrentUser cu = (CurrentUser)session.getAttribute("currentUserLogin");
		mv.addObject("user",cu);
		mv.addObject("accessToken",cu.getAccessToken());
		mv.setViewName("search");
		return mv;
	}
	
	
	@RequestMapping(path = "userDashboard", method = RequestMethod.GET)
	private ModelAndView getUserDashboard(HttpSession session){
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",session.getAttribute("currentUserLogin"));
		mv.setViewName("dashboard");
		return mv;
	}
	
	
	
	@RequestMapping(path = "manageUsers", method = RequestMethod.GET)
	private ModelAndView getManageUsers(HttpSession session){
		ModelAndView mv = new ModelAndView();
		CurrentUser cu = (CurrentUser) session.getAttribute("currentUserLogin");
		if(cu.getUserType().getAccessLevel() >= 2){
			mv.setViewName("dashboard"); //TODO why dashboard?
			mv.addObject("message","You are not an admin user, you cannot manage other users.");
		}else{
			mv.addObject("user",cu);
			mv.setViewName("manageUsers");
		}
		return mv;
	}
	
	
	
	
	
}
