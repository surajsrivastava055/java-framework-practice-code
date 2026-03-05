package com.gyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@ResponseBody
	@RequestMapping(path="/add", method=RequestMethod.GET)
	public String addUser() {
		System.out.println("Added User success...");
		return "User Added successfully..";
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/hello")
	public String showMsg() {
		System.out.println("Executed....");
		return "message"; 
	}
}
