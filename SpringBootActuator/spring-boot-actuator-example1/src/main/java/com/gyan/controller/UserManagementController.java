package com.gyan.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementController {
	
	@PostMapping("/add/product")
	public String addProduct() {
		return "Added Successfully";
	}
}
