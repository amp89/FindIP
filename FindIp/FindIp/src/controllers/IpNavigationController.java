package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IpNavigationController {
	
	@RequestMapping(path = "search", method = RequestMethod.GET)
	private ModelAndView setUpSearch(HttpSession session){
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",session.getAttribute("currentUserLogin"));
		mv.setViewName("search");
		return mv;
	}
}
