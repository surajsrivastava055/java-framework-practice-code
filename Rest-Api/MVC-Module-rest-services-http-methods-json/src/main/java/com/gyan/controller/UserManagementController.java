package com.gyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.services.UserManagementService;

@RestController
public class UserManagementController {
	
	@Autowired
	public UserManagementService userManagementService;
	
	//add user: POST
	@RequestMapping(path="/addUser", method=RequestMethod.POST)
	public String addUser() {
		String data=userManagementService.addUserDetails();
		return data;
	}
	
	//update user: PUT
	@RequestMapping(path="/changePassword", method=RequestMethod.PUT)
	public String changePassword() {
		String data=userManagementService.changeUserPassword();
		return data;
	}
	
	//delete user: DELETE
	
	//get user details: GET
	
	
}
