package com.gyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyan.entity.UserDetailsEntity;
import com.gyan.repository.UserRepository;
import com.gyan.request.LoginDetailsRequest;
import com.gyan.request.UserDetailsRequest;
import com.gyan.response.LoginDetailResponse;

@Service
public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	public String createUser(UserDetailsRequest userDetailsRequest) {
		
		//Transferring data from 1 java object to another java object
		UserDetailsEntity userDetails=new UserDetailsEntity();
		userDetails.setFirstName(userDetailsRequest.getFirstName());
		userDetails.setLastName(userDetailsRequest.getLastname());
		userDetails.setEmailId(userDetailsRequest.getEmailId());
		userDetails.setMobileNumber(userDetailsRequest.getMobileNumber());
		userDetails.setPassword(userDetailsRequest.getPassword());
		userDetails.setAge(userDetailsRequest.getAge());
		userDetails.setSalary(userDetailsRequest.getSalary());
		
		if(userRepository.findById(userDetailsRequest.getEmailId()).isEmpty()) {
			userRepository.save(userDetails);
			return "User Added Successfully";
		}
		return "User Already Exists";
	}

	public LoginDetailResponse loginUser(LoginDetailsRequest loginDetailsRequest) {
		
		UserDetailsEntity userDetailsEntity=userRepository.findByEmailIdAndPassword(loginDetailsRequest.getEmailId(),loginDetailsRequest.getPassword());
		
		if(userDetailsEntity!=null) {
			
			LoginDetailResponse res=new LoginDetailResponse();
			res.setFirstName(userDetailsEntity.getFirstName());
			res.setLastName(userDetailsEntity.getLastName());
			res.setEmailId(userDetailsEntity.getEmailId());
			res.setMobileNumber(userDetailsEntity.getMobileNumber());
			res.setPassword(userDetailsEntity.getPassword());
			res.setAge(userDetailsEntity.getAge());
			res.setSalary(userDetailsEntity.getSalary());
			
			return res;
		}else {
			return null;
		}	
	}
}
