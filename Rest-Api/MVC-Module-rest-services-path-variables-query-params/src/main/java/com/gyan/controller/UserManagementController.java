package com.gyan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.request.ChangePasswordRequest;
import com.gyan.request.UserManagementRequest;
import com.gyan.response.UserManagementResponse;
import com.gyan.service.UserManagementService;

@RestController
public class UserManagementController {
	
	@Autowired
	UserManagementService userManagementService;
	
	//************************************CREATE/INSERT OPERATION*****************************************
	
	// Inserting resource
	@PostMapping("/create/user")
	public UserManagementResponse createUser(@RequestBody UserManagementRequest userManagementRequest ) {
		
		System.out.println(userManagementRequest);
		return userManagementService.createUser(userManagementRequest);
		
	}
	
	//************************************READ OPERATION*****************************************
	//load all the resource (user information)
	@GetMapping("/load/users")
	public List<UserManagementResponse> loadAllUser(){
		
		List<UserManagementResponse> data=userManagementService.loadAllUser();
		
		return data;
	}
	
	//##################################### Path Variable #################################
	
	//load user information based on email id
	//Read: GET method
	//{emailId}: a variable
	//localhost:8080/api/user/info/gyan@gmail.com
	 
	@GetMapping("/user/info/{emailId}")
	//binding path variable value to method argument.
	public UserManagementResponse loadUserDetailsBasedOnEmailId(@PathVariable("emailId") String emailId) {
		UserManagementResponse data=userManagementService.loadUserDetailsBasedOnEmailId(emailId);
		return data;
	}
	
	//load all user info based on city
	@GetMapping("/user/info/city/{city}")
	//binding path variable value to method argument.
	public List<UserManagementResponse> loadUserDetailsBasedOnCity(@PathVariable("city") String city) {
		List<UserManagementResponse> data=userManagementService.loadUserDetailsBasedOnCity(city);
		return data;
	}
	
	//load all user info based on city and gender
	@GetMapping("/user/info/{city}/{gender}")
	//binding path variable value to method argument.
	public List<UserManagementResponse> loadUserDetailsBasedOnCityAndGender(@PathVariable("city") String city,@PathVariable("gender") String gender) {
		List<UserManagementResponse> data=userManagementService.loadUserDetailsBasedOnCityAndGender(city,gender);
		return data;
	}
	
	
	//##################################### Query Parameter/Request Parameter #################################
	
	//http://localhost:8080/api/user/info?city=Delhi
	//load all user info based on city
		@GetMapping("/user/info")
		//binding path variable value to method argument.
		public List<UserManagementResponse> loadUserBasedOnCity(@RequestParam("city") String city) {
			List<UserManagementResponse> data=userManagementService.loadUserDetailsBasedOnCity(city);
			return data;
		}
		
	// Rest Also Similar do by your self...
		
	//##################################### Query Parameter with Optional Value #################################
		
	//http://localhost:8080/api/user/info?city=Delhi
	//load all user info based on city
	@GetMapping("/user/info/v2")
	//binding path variable value to method argument.
	public List<UserManagementResponse> loadUserBasedOnCityAndGender(@RequestParam(name="city",required=false) String city,@RequestParam(name="gender",required=false) String gender) {
		
		if(city!=null && gender!=null) {
			List<UserManagementResponse> data=userManagementService.loadUserDetailsBasedOnCityAndGender(city,gender);
			return data;
		}else if(city==null && gender!=null) {
			List<UserManagementResponse> data=userManagementService.loadUserDetailsBasedOnGender(gender);
			return data;
		}else if(city!=null && gender==null) {
			List<UserManagementResponse> data=userManagementService.loadUserDetailsBasedOnCity(city);
			return data;
		}else {
			List<UserManagementResponse> data=userManagementService.loadAllUser();
			return data;
		}
	}
	
	
	//************************************UPDATE OPERATION*****************************************
	
	//Requirement: Change user password
	@PutMapping(path="users/change/password/{emailId}")
	public String changeUserPassword(@PathVariable String emailId, @RequestBody ChangePasswordRequest request) {
		if(request.getNewPassword().equals(request.getConfirmPassword())) {
			return userManagementService.changeUserPassword(emailId,request);
		}else {
			return "New Password and Confirm Password not matched try again";
		}
	}
	
	// rest requirement do by your self...
	
	//************************************DELETE OPERATION*****************************************
	
		//Requirement: delete user details based on email id.
		@PutMapping(path="users/delete/{emailId}")
		public String deleteUserDetails(@PathVariable String emailId) {
				return userManagementService.deleteUserDetails(emailId);
		}
		
		//Requirement: delete user details based on city.
		@PutMapping(path="users/delete/city/{city}")
		public String deleteUserDetailsByCity(@PathVariable String city) {
				return userManagementService.deleteUserDetailsByCity(city);
		}
	
	
	
}
