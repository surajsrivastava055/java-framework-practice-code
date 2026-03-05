package com.gyan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyan.entity.UserInformation;
import com.gyan.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public String createUser(UserInformation userInformation) {
		
		userRepository.save(userInformation);
		return "User Created Successfully..";
	}

	public UserInformation getUserDetails(String emailId) {
		Optional<UserInformation>data=userRepository.findById(emailId);
		if(data.isPresent()) {
			UserInformation data1=data.get();
			return data1;
		}
		return null;
	}

}
