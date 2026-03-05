package com.gyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.request.UserSignUpRequest;
import com.gyan.service.UserAccountsService;
@RestController
@RequestMapping("/user")
public class UserAccountsController {
	
	@Autowired
	public UserAccountsService userAccountsService;
	
	//HTTP method: Create Operation Sensitive data -> POST method
	//path= /user/signup
	
	/*
	{
	    "firstName": "Gyan",
	    "lastname": "Shrivastava",
	    "emailId": "gyan@gmail.com",
	    "mobileNumber": "6576765677",
	    "password": "gyan123",
	    "age": 12,
	    "salary": 765767.98
	}
	*/
	
	@PostMapping(path="/signup")
	public String userSignup(@RequestBody UserSignUpRequest userSignUpRequest) {
		System.out.println(userSignUpRequest);
		String result=userAccountsService.userSignup(userSignUpRequest);
		return result;
	}
	
	//response
	@GetMapping(path="/get/details")
	public UserSignUpRequest getSignupDetails() {
		
		UserSignUpRequest userSignUpRequest=new UserSignUpRequest();
		userSignUpRequest.setFirstName("Anuj");
		userSignUpRequest.setLastname("Gupta");
		userSignUpRequest.setEmailId("anuj@gmail.com");
		userSignUpRequest.setMobileNumber("8601246751");
		userSignUpRequest.setPassword("anuj123");
		userSignUpRequest.setAge(26);
		userSignUpRequest.setSalary(500000);
		
		System.out.println(userSignUpRequest);	
		
		// here java object converted into JSON
		return userSignUpRequest;
	}
	
}
