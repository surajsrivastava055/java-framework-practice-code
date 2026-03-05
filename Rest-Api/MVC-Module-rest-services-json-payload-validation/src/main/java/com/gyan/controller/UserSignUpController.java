package com.gyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.request.UserSignUpRequest;
import com.gyan.service.UserSignUpService;

import jakarta.validation.Valid;

@RestController
public class UserSignUpController {
	
	@Autowired
	UserSignUpService userSignUpService;
	
	@PostMapping("/create/signup")
	public String userSignUp(@Valid @RequestBody UserSignUpRequest userSignUpRequest) {
		
		System.out.println("userSignUp Controller method executed:"+userSignUpRequest);
		
		String data=userSignUpService.userSignUp(userSignUpRequest);
		return data;
	}

}
