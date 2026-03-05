package com.gyan.services;

import org.springframework.stereotype.Service;

@Service
public class UserManagementService {

	public String addUserDetails() {
		System.out.println("User Added successfully");
		return "Added user details successfully..";
	}
	
	public String changeUserPassword() {
		System.out.println("User Password change successfully");
		return "User Password change successfully....";
	}
	
}
