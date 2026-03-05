package com.gyan.controller;

import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReelsController {
	
	@PostMapping("/api/upload/reel")
	public String uploadReels() {
		return "Reel Successfully uploaded..";
	}

}
