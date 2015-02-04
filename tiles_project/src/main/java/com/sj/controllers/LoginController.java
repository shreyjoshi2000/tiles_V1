package com.sj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sj.model.Account;

@Controller
@RequestMapping(value="/BoSJ")
public class LoginController {
		
	private Account account;
	// specify that get must be called with parameter new.i.e get?new
	@RequestMapping(method=RequestMethod.GET,params="new")
	public String getForm(Model model){
		model.addAttribute(new Account());
		return "form";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public void saveForm( ){
		
		
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
