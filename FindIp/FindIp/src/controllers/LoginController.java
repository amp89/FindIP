package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import data.CurrentUser;
import data.IpDAO;

@Controller
@SessionAttributes({"currentUserLogin"})
public class LoginController {
	
	@ModelAttribute("currentUserLogin")
	private CurrentUser setBlankCurrentUserLogin(){
		return new CurrentUser();
	}
	
	@Autowired
	private IpDAO dao;
	
	@RequestMapping(path = "index.html", method = RequestMethod.GET)
	private ModelAndView renderIndexPage(HttpSession session, @ModelAttribute("currentUserLogin") CurrentUser currentUserLogin){
		ModelAndView mv = new ModelAndView();
		//TODO temporary redirect to search page
		session.setAttribute("currentUserLogin", currentUserLogin);
		mv.setViewName("search");
		
		return mv;
	}
	

}