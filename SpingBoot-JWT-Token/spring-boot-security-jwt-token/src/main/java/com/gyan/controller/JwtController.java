package com.gyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.security.JwtUtil;

@RestController
public class JwtController {

	@Autowired
	JwtUtil jwtUtil;
	
	@GetMapping("jwt/validate/token/{emailId}")
	public Boolean validateToken(@PathVariable String emailId) {
		return jwtUtil.isTokenValid("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJneWFuQGdtYWlsLmNvbSIsImlhdCI6MTc2OTE1MzY4NSwiZXhwIjoxNzY5MTUzOTg1fQ.HVDHe4r8Atal6kc7-dnrs82UU3SJOlLTBOlzvIg15SNVstJZPZlJRSZdnucuSHHgtAyk9zOV1aw6x4Ys5UF2_g", emailId);
	}
	
	@GetMapping("jwt/create/token/{emailId}")
	public String generateToken(@PathVariable String emailId) {
		return jwtUtil.createToken(emailId);
	}
}
