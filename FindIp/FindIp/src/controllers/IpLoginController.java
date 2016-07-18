package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import data.IpDAO;
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
		mv.addObject("user",new User());
		mv.setViewName("index");
		return mv;
	}

	//TODO test method
	@RequestMapping(path = "login", method = RequestMethod.GET)
	private ModelAndView renderIndexPage(HttpSession session){
		ModelAndView mv = new ModelAndView();
//		currentUserLogin = dao.getTestUser();
//		System.out.println(currentUserLogin);
		session.setAttribute("currentUserLogin", dao.getTestUser());
		System.out.println("on session: " + session.getAttribute("currentUserLogin"));
		//TODO for testing
//		mv.setViewName("search");
		mv.setViewName("postTest");
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
