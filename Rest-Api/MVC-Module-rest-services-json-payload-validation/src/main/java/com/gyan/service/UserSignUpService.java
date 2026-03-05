package com.gyan.service;

import org.springframework.stereotype.Service;

import com.gyan.request.UserSignUpRequest;

@Service
public class UserSignUpService {

	public String userSignUp(UserSignUpRequest userSignUpRequest) {
		System.out.println("userSignUp Service method executed:"+userSignUpRequest);
		return "User Signup Successfull";
	}
	
	

}
