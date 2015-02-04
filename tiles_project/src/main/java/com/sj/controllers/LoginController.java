package com.sj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sj.model.User;

@Controller
public class LoginController {
		
	// specify that get must be called with parameter new.i.e get?new
	@RequestMapping(value="/getForm",method=RequestMethod.GET,params="new")
	public String getForm(){
		return "form";
	}
	
	@RequestMapping(value="/getSignForm")
	public String getSignInForm(){
		return "SignInForm";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView saveForm(@ModelAttribute("user1") User user1){
		
		
		ModelAndView mav=new ModelAndView("displayUser3");
		mav.addObject("user2", user1);
		mav.addObject("msg", "login success");
		return mav;
		
		
	}

	
}
