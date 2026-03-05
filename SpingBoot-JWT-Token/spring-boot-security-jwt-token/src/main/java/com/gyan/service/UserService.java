package com.gyan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.gyan.entity.UserInformationEntity;
import com.gyan.repository.UserRepository;
import com.gyan.request.ChangePasswordRequest;
import com.gyan.request.UserInformationRequest;
import com.gyan.request.UserLoginRequest;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public String userRegister(UserInformationRequest userInformationRequest) {
		// TODO Auto-generated method stub
		UserInformationEntity entity=new UserInformationEntity(userInformationRequest.getEmail(),bCryptPasswordEncoder.encode(userInformationRequest.getPassword()),
										userInformationRequest.getMobileNumber(),userInformationRequest.getName());
		if(userRepository.findById(userInformationRequest.getEmail()).isPresent()) {
			return "Registration Failed please try again";
		}else {
			UserInformationEntity data=userRepository.save(entity);
			return "User Registration done successfully User:"+data.getName();
		}
		
	}

	public String userLogin(UserLoginRequest userLoginRequest) {
		
		UserInformationEntity entity=userRepository.findByEmailAndPassword(userLoginRequest.getEmail(),userLoginRequest.getPassword());
		
		if(entity!=null) {
			return "User Login successfully UserName:"+entity.getName();
		}else {
			return "Login Failed please try again";
		}
	}

	public String changePassword(ChangePasswordRequest changePasswordRequest, String userId) {
		Optional<UserInformationEntity> data1=userRepository.findById(userId);
		UserInformationEntity data=data1.get();
		if(data!=null) {
			data.setPassword(bCryptPasswordEncoder.encode(changePasswordRequest.getNewPassword()));
			userRepository.save(data);
			return "Password Change Successfully..";
		}else {
			return "Password Change Failed Try again...";
		}
	}

	public String deleteUser(String userId) {
		if(userRepository.findById(userId).isPresent()) {
			userRepository.deleteById(userId);			
			return "User Deleted successfully";
		}else {
			return "User Details Not Found Oops!";
		}
	}

}
