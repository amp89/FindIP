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
	private ModelAndView renderIndex(HttpSession session){
		if(session.getAttribute("currentUserLogin") == null){
			ModelAndView mv = new ModelAndView();
			mv.addObject("message","Sign In, or Sign Up!");
			mv.addObject("userLogin",new UserLoginObject());
			mv.addObject("user",new User());
			mv.setViewName("index");
			return mv;
			
		}else{
			return new ModelAndView("redirect:/search.do");
		}
	}
	
	@RequestMapping(path = "logout", method=RequestMethod.GET)
	private ModelAndView logout(HttpSession session){
		session.setAttribute("currentUserLogin",null);
		System.out.println("logged out"); //TODO remove
		System.out.println("Should be null: " + session.getAttribute("currentUserLogin")); //TODO remove
		return new ModelAndView("redirect:/index.do");
	}

	@RequestMapping(path="signup", method=RequestMethod.POST)
	private ModelAndView signUp(UserLoginObject user, HttpSession session){
		System.out.println(user);
		if(dao.signUp(user) && ((CurrentUser)session.getAttribute("currentUserLogin") == null)){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("confirm");
			mv.addObject("userLogin",new UserLoginObject());
			System.out.println("will add"); //TODO remove
			return mv;
		}else{
			ModelAndView mv = new ModelAndView("redirect:/index.do");
			mv.addObject("message","That email is in use... choose another");
			System.out.println("Exsits or logged in"); //TODO remove
			return mv;
		}
	} // signUp()
	
	//for email link:...
	@RequestMapping(path="emailConfirm", method=RequestMethod.GET)
	private ModelAndView emailConfirm(){
		return new ModelAndView("redirect:/reconfirm.do");
	}
	
	@RequestMapping(path="reconfirm", method=RequestMethod.GET)
	private ModelAndView reconfirm(HttpSession session){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("confirm");
		mv.addObject("userLogin",new UserLoginObject());
		return mv;
		
	}
	
	@RequestMapping(path="confirm", method=RequestMethod.POST)
	private ModelAndView confrim(UserLoginObject userToConfrim, HttpSession sessoin){
		if(dao.confirmUserAccount(userToConfrim)){
			System.out.println("User Confirmed"); //TODO remove
			return new ModelAndView("redirect:/index.do");
		}else{
			ModelAndView mv = new ModelAndView("redirect:/reconfirm.do");
			System.out.println("User NOOOTTT Confirmed"); //TODO remove
			return mv;
		}
	}//confrim
	

	
	//TODO test method
	@RequestMapping(path = "login", method = RequestMethod.POST)
	private ModelAndView login(@ModelAttribute("user") @Valid UserLoginObject user, Errors errors, HttpSession session){
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",new User());
		
		if(errors.getErrorCount() == 0){
			System.out.println("GOOD INPUT: " + user); //TODO remove
			CurrentUser cu = dao.authenticateUser(user);
			if(cu == null){
				mv.addObject("message","Check your login credentials and try again.");
				mv.addObject("userLogin",new User()); 
				mv.addObject("user",new User());//this help?
			}else if(cu.getAccountLocked()){
				mv.addObject("message","Account Has Been Locked.  Reset your password, and try again.");
				mv.addObject("userLogin",new User());
				mv.addObject("user",new User()); //this help?
			}
			//login success TODO check if getAccountLocked was ever implemented.
			else if(cu != null && !cu.getAccountLocked()){
				session.setAttribute("currentUserLogin",cu);
				mv.setViewName("search");   //TODO take this and the next line out to see if it affects anything
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
		session.setAttribute("currentUserLogin", null);
		System.out.println("on session: " + session.getAttribute("currentUserLogin"));
		//TODO for testing
//		mv.setViewName("search");
		mv.setViewName("index");
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
