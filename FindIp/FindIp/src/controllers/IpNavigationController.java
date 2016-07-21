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
		CurrentUser cu = (CurrentUser)session.getAttribute("currentUserLogin");
		if(cu == null){
			return new ModelAndView("redirect:/index.do");
		}else{			
			return getUserAndAccessTokenMV(cu,"search");
		}
	}
	
	
	@RequestMapping(path = "userDashboard", method = RequestMethod.GET)
	private ModelAndView getUserDashboard(HttpSession session){
		CurrentUser cu = (CurrentUser)session.getAttribute("currentUserLogin");
		if(cu == null){
			return new ModelAndView("redirect:/index.do");
		}else{			
			return getUserAndAccessTokenMV(cu, "dashboard");
		}
	}
	
	
	
	@RequestMapping(path = "manageUsers", method = RequestMethod.GET)
	private ModelAndView getManageUsers(HttpSession session){
		CurrentUser cu = (CurrentUser)session.getAttribute("currentUserLogin");
		if(cu == null){
			return new ModelAndView("redirect:/index.do");
		}else{
			if(cu.getUserType().getAccessLevel() >= 2){
				return getUserAndAccessTokenMV(cu,"manageUsers");
			}else{
				return new ModelAndView("redirect:/userDashboard.do");				
			}
		}
	}//manage users
	
	private ModelAndView getUserAndAccessTokenMV(CurrentUser cu, String viewName){
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",cu);
		mv.addObject("accessToken",cu.getAccessToken());
		mv.setViewName(viewName);
		return mv;
	}
	
	
	
	
	
}
