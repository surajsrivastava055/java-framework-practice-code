package com.gyan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyan.entity.UserDetails;
import com.gyan.repository.UserManagementRepository;

@Service
public class UserManagementService {
	
	@Autowired
	UserManagementRepository userManagementRepository; 
	
	public String signupService(String name,String email, String password) {
		
		Optional<UserDetails> data=userManagementRepository.findById(email);
		if(data.isPresent()) {
			return "Email Already exists please Signup with diffrent account";
		}else {
			UserDetails user=new UserDetails(name,email,password);
			userManagementRepository.save(user);
			return "Account Created Successfully Please Login Now";
		}

	}
	
	public String signInService(String email, String password) {
		
		UserDetails data=userManagementRepository.findByEmailAndPassword(email,password);
		if(data!=null) {
			return "Welcome "+data.getName();
		}else {
			return "Invalid Credential Please try Again";
		}

	}
	

}
