package com.gyan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(path="/user", method=RequestMethod.GET)
	public String addUser() {
		System.out.println("User Added Successfully...");
		return "Added User as per your requirement..";
	}
	

}
