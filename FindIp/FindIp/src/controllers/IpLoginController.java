package controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import data.CurrentUser;
import data.IpDAO;
import data.UserLoginObject;
import entities.User;

@Controller
//@SessionAttributes({"currentUserLogin"})
public class IpLoginController{
	
//	@ModelAttribute("currentUserLogin")
//	private CurrentUser setBlankCurrentUserLogin(){
////		return (CurrentUser) session.getAttribute("currentUserLogin");
//		return dao.getTestUser();
////		return (CurrentUser) session.getAttribute("currentUserLogin");
//	}
//	
	
	
	//TODO print session method
	
	@Autowired
	private IpDAO dao;
	
	@RequestMapping(path = "index", method=RequestMethod.GET)
	private ModelAndView renderIndex(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("testMSG","test message");
		mv.addObject("user",new UserLoginObject());
		mv.setViewName("index");
		return mv;
	}

	//TODO test method
	@RequestMapping(path = "login", method = RequestMethod.POST)
	private ModelAndView login(@ModelAttribute("user") @Valid UserLoginObject user, Errors errors, HttpSession session){
		ModelAndView mv = new ModelAndView();
		
		if(errors.getErrorCount() == 0){
			System.out.println("GOOD INPUT: " + user); //TODO remove
			CurrentUser cu = dao.authenticateUser(user);
			if(cu == null){
				mv.addObject("message","Check your login credentials and try again.");
				mv.addObject("user",user);
			}else if(cu.getAccountLocked()){
				mv.addObject("message","Account Has Been Locked.  Reset your password, and try again.");
				mv.addObject("user",new User());
			}
			//login success
			else if(cu != null && !cu.getAccountLocked()){
				session.setAttribute("currentUserLogin",cu);
				mv.setViewName("search");
				mv.addObject("user",user);
				return new ModelAndView("redirect:/search.do");
			}
		}else{
			System.out.println("BAD INPUT: " + user); //TODO remove
			mv.addObject("message","BAD INPUT"); //Change to search
			mv.setViewName("index");
		}
		
//		currentUserLogin = dao.getTestUser();
//		System.out.println(currentUserLogin);
		session.setAttribute("currentUserLogin", dao.getTestUser());
		System.out.println("on session: " + session.getAttribute("currentUserLogin"));
		//TODO for testing
//		mv.setViewName("search");
		mv.setViewName("index");
		return mv;
	}
	
	
	@RequestMapping(path = "search", method = RequestMethod.GET)
	private ModelAndView setUpSearch(HttpSession session){
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",session.getAttribute("currentUserLogin"));
		mv.setViewName("search");
		return mv;
	}
	
	//TODO test method
	@RequestMapping(path = "index2", method = RequestMethod.GET)
	private ModelAndView renderIndexPage2(HttpSession session){
		ModelAndView mv = new ModelAndView();
//		currentUserLogin = dao.getTestUser();
//		System.out.println(currentUserLogin);
		session.setAttribute("currentUserLogin", dao.getTestUser());
		System.out.println("on session: " + session.getAttribute("currentUserLogin"));
		//TODO for testing
//		mv.setViewName("search");
		mv.setViewName("search");
		return mv;
	}
	
	
	

}
