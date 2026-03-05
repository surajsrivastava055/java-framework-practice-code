package com.gyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.request.ChangePasswordRequest;
import com.gyan.request.UserInformationRequest;
import com.gyan.request.UserLoginRequest;
import com.gyan.security.JwtUtil;
import com.gyan.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JwtUtil jwtUtil;
	
	@PostMapping("/public/user/register")
	public String userRegister(@RequestBody UserInformationRequest userInformationRequest) {
		return userService.userRegister(userInformationRequest);
	}
	
	@PostMapping("/public/user/login")
	public ResponseEntity<String> userLogin(@RequestBody UserLoginRequest userLoginRequest) {
		
		String response=null;
		UsernamePasswordAuthenticationToken credentials=new UsernamePasswordAuthenticationToken(userLoginRequest.getEmail(),userLoginRequest.getPassword());
		
		try {
			Authentication auth=authenticationManager.authenticate(credentials);
			System.out.println(auth.getCredentials());
		}catch(BadCredentialsException ex) {
			System.out.println("UserController: BadCredentialsException");
			response="Invalid Credentials";
			return new ResponseEntity<String>(response, HttpStatusCode.valueOf(401));
		}
		
		String token=jwtUtil.createToken(userLoginRequest.getEmail());
		HttpHeaders headers=new HttpHeaders();
		headers.add("Authorization", token);
		
		return new ResponseEntity<String>("Welcome to Home"+userLoginRequest.getEmail(),headers, HttpStatusCode.valueOf(200));
		
	}
	
	@PostMapping("/api/user/change/password/{userId}")
	public String changePassword(@RequestBody ChangePasswordRequest changePasswordRequest,@PathVariable String userId) {
		return userService.changePassword(changePasswordRequest,userId);
	}
	
	@DeleteMapping("/api/user/delete/{userId}")
	public String deleteUser(@PathVariable String userId) {
		return userService.deleteUser(userId);
	}
}
