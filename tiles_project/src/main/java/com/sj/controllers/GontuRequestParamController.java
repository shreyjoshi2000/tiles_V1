package com.sj.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/Gontu")
public class GontuRequestParamController {
	
	
	//http://localhost:6214/tiles_project/Gontu/Form1?userName=rock&id=7
	@RequestMapping(value="/Form", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView getRequestParam(@RequestParam(value="userName",defaultValue="Shrey") String name,@RequestParam(value="id") String ID){
		
		ModelAndView mav= new ModelAndView("displayUser2");
		mav.addObject("msg", "Hi"+name+ "with id"+ID  );
		return mav;
	}


	@RequestMapping(value="/Form1")
	public ModelAndView getRequestParam2(@RequestParam Map<String,String> reqp){
		
		ModelAndView mav= new ModelAndView("displayUser2");
		
		mav.addObject("msg", "Hi"+reqp.get("userName")+ "with id"+reqp.get("id") );
		return mav;
	}
	
	
	
	@RequestMapping(value="/Form2")
	public ModelAndView getRequestParam3(@RequestParam String userName, @RequestParam String id){
		
		ModelAndView mav= new ModelAndView("displayUser2");
		mav.addObject("msg", "Hi"+userName+ "with id"+id );
		return mav;
	}

	
}
