package com.gyan.service;

import org.springframework.stereotype.Service;
import com.gyan.request.UserSignUpRequest;

@Service
public class UserAccountsService {
	
	public String userSignup(UserSignUpRequest userSignUpRequest) {
		return "User Added successfully";
	}
}
