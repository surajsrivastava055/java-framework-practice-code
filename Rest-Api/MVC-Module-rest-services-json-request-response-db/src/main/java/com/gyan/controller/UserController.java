package com.gyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.request.LoginDetailsRequest;
import com.gyan.request.UserDetailsRequest;
import com.gyan.response.LoginDetailResponse;
import com.gyan.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@PostMapping(path="/create")
	public String createUser(@RequestBody UserDetailsRequest userDetailsRequest ) {
		String result=userService.createUser(userDetailsRequest);
		return result;
	}
	
	@PostMapping(path="/login")
	public LoginDetailResponse loginUser(@RequestBody LoginDetailsRequest loginDetailsRequest) {
		
		LoginDetailResponse response=userService.loginUser(loginDetailsRequest);
		return response;
	}
	

}
