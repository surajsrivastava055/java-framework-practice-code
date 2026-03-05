package com.gyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.entity.UserInformation;
import com.gyan.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public String createUser(@RequestBody UserInformation userInformation) {
		
		return userService.createUser(userInformation);
	}
	
	@GetMapping("/user/{emailId}")
	public UserInformation getUserDetails(@PathVariable String emailId) {
		
		return userService.getUserDetails(emailId);
	}

}
