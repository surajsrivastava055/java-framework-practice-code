package com.gyan.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.dto.UserInformationResquest;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserManagementController {
	//*********************************REQUEST HEADER*****************************
	//Getting Custom header mandatory from request
	@GetMapping("load/{emailId}")
	public UserInformationResquest getUserByEmailId(@PathVariable String emailId, @RequestHeader("Security-Token") String token) {
		System.out.println("Token="+token);
		return new UserInformationResquest("Gyan","suraj@gmail.com","suraj123");
	}
	
	//Getting Custom header but optional from request with default value
	@GetMapping("load/data/{emailId}")
	public UserInformationResquest getUserByEmailId1(@PathVariable String emailId, @RequestHeader(name="Security-Token", required=false, defaultValue="hjkhgbjgjyu") String token) {
		System.out.println("Token="+token);
		return new UserInformationResquest("Gyan","suraj@gmail.com","suraj123");
	}
	
	//Read Any header value user-defined or pre-defined value.
	@GetMapping("load/all/{emailId}")
	public UserInformationResquest getUserByEmailId2(@PathVariable String emailId, HttpServletRequest request) {
		System.out.println(request.getHeader("Accept"));
		System.out.println(request.getHeader("Security-Token"));
		System.out.println(request.getHeader("Connection"));
		return new UserInformationResquest("Gyan","suraj@gmail.com","suraj123");
	}
	
	
	//********************************** Response Header**************************
	@GetMapping("login/authentication")
	public ResponseEntity<UserInformationResquest> loginAuthentication(@RequestBody UserInformationResquest request) {
		
		HttpHeaders header=new HttpHeaders();
		header.add("Data", "Success");
		header.add("Security-Token", "abchgfj454754v");
		
		//--->service -> repository -->DB
		boolean isValidUser=true; //came from service
		
		if(isValidUser) {
			return ResponseEntity.ok().headers(header).body(new UserInformationResquest("Gyan","gyan@gmail.com","gyan123"));	
		}else {
			return ResponseEntity.notFound().build();
		}
	}

}
