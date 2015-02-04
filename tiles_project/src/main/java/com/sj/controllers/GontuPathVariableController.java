package com.sj.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/Gontu")
public class GontuPathVariableController {

	//http://localhost:6214/tiles_project/Gontu/Users/shrey/4
	
	@RequestMapping(value="/Users/{UserName}/{ID}")
	public ModelAndView showPathVariable(@PathVariable("UserName") String name, @PathVariable("ID") String id){
		ModelAndView mav= new ModelAndView();
		mav.addObject("UserName", name);
		mav.addObject("ID", id);
		mav.setViewName("displayUser");
		return mav;
	}
	
	// note to use map in pathvariable we must put 
	//<mvc:annotation-driven /> in *-servlet.xml
	
	@RequestMapping(value="/Users2/{UserName}/{ID}")
	public ModelAndView showPathVariable2(@PathVariable Map<String,String> pvar){
		
		ModelAndView mav= new ModelAndView("displayUser");
		String name=pvar.get("UserName");
		String id=pvar.get("ID");
		System.out.println("Hi "+name+"with id:"+ id);
		
		mav.addAllObjects(pvar);
		return mav;
	}
	
}
