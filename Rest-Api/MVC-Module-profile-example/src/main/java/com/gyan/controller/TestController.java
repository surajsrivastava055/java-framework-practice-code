package com.gyan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${contact.email}")
	private String contactEmail;
	
	@GetMapping("/test")
	public String sendEmail() {
		System.out.println("Sending Email:"+contactEmail);
		
		return "Sending Email:" +contactEmail;
	}

}
