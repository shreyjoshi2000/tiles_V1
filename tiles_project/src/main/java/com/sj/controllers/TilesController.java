package com.sj.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TilesController {

	 @RequestMapping(value="/tt", method={RequestMethod.GET})
	    public String homePage(HttpServletRequest request) {
		return "template";
	    }
	
}
