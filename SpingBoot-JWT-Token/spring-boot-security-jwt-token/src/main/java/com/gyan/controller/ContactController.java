package com.gyan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@GetMapping("/public/user/contact")
	public String getContact() {
		return "Mobile Number: +7687675645, EnailId: gyan@gmail.com";
	}
}
