package com.sj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InternalViewController {
	@RequestMapping(value="/getView")
	public String getView(){
		
		return "abc";
	}
}
