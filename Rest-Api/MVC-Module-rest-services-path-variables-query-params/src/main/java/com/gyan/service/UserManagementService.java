package com.gyan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyan.entity.UserManagementEntity;
import com.gyan.repository.UserManagementRepository;
import com.gyan.request.ChangePasswordRequest;
import com.gyan.request.UserManagementRequest;
import com.gyan.response.UserManagementResponse;

@Service
public class UserManagementService {
	
	@Autowired
	UserManagementRepository userManagementRepository; 

	public UserManagementResponse createUser(UserManagementRequest userManagementRequest) {
		
		UserManagementEntity data=new UserManagementEntity();
		data.setCity(userManagementRequest.getCity());
		data.setCountry(userManagementRequest.getCountry());
		data.setEmailId(userManagementRequest.getEmailId());
		data.setGender(userManagementRequest.getGender());
		data.setMobile(userManagementRequest.getMobile());
		data.setName(userManagementRequest.getName());
		data.setPassword(userManagementRequest.getPassword());
		data.setQualification(userManagementRequest.getQualification());
		
		UserManagementEntity data1=userManagementRepository.save(data);
		
		UserManagementResponse details=new UserManagementResponse();
		details.setCity(data1.getCity());
		details.setCountry(data1.getCountry());
		details.setEmailId(data1.getEmailId());
		details.setGender(data1.getGender());
		details.setMobile(data1.getMobile());
		details.setName(data1.getName());
		details.setPassword(data1.getPassword());
		details.setQualification(data1.getQualification());
		
		return details;
	}

	public List<UserManagementResponse> loadAllUser() {
		List<UserManagementEntity> data1=userManagementRepository.findAll();
		
		List<UserManagementResponse> response=new ArrayList<>();
		
		for(UserManagementEntity detail:data1) {
			
			UserManagementResponse details=new UserManagementResponse();
			details.setCity(detail.getCity());
			details.setCountry(detail.getCountry());
			details.setEmailId(detail.getEmailId());
			details.setGender(detail.getGender());
			details.setMobile(detail.getMobile());
			details.setName(detail.getName());
			details.setPassword(detail.getPassword());
			details.setQualification(detail.getQualification());
			
			response.add(details);
			
		}
		return response;
	}

	public UserManagementResponse loadUserDetailsBasedOnEmailId(String emailId) {
		Optional<UserManagementEntity> data=userManagementRepository.findById(emailId);
		
		if(data.isPresent()) {
		UserManagementEntity data1=data.get();
		
		UserManagementResponse details=new UserManagementResponse();
		details.setCity(data1.getCity());
		details.setCountry(data1.getCountry());
		details.setEmailId(data1.getEmailId());
		details.setGender(data1.getGender());
		details.setMobile(data1.getMobile());
		details.setName(data1.getName());
		details.setPassword(data1.getPassword());
		details.setQualification(data1.getQualification());
		
		return details;
		}else {
			return null;
		}
	}
	
	public List<UserManagementResponse> loadUserDetailsBasedOnCity(String city) {
		List<UserManagementEntity> data1=userManagementRepository.findByCity(city);
		
			List<UserManagementResponse> response=new ArrayList<>();
			
			for(UserManagementEntity detail:data1) {
				
				UserManagementResponse details=new UserManagementResponse();
				details.setCity(detail.getCity());
				details.setCountry(detail.getCountry());
				details.setEmailId(detail.getEmailId());
				details.setGender(detail.getGender());
				details.setMobile(detail.getMobile());
				details.setName(detail.getName());
				details.setPassword(detail.getPassword());
				details.setQualification(detail.getQualification());
				
				response.add(details);
				
			}
			return response;
	}
	
	public List<UserManagementResponse> loadUserDetailsBasedOnCityAndGender(String city,String gender) {
		List<UserManagementEntity> data1=userManagementRepository.findByCityAndGender(city,gender);
		
			List<UserManagementResponse> response=new ArrayList<>();
			
			for(UserManagementEntity detail:data1) {
				
				UserManagementResponse details=new UserManagementResponse();
				details.setCity(detail.getCity());
				details.setCountry(detail.getCountry());
				details.setEmailId(detail.getEmailId());
				details.setGender(detail.getGender());
				details.setMobile(detail.getMobile());
				details.setName(detail.getName());
				details.setPassword(detail.getPassword());
				details.setQualification(detail.getQualification());
				
				response.add(details);
				
			}
			return response;
	}
	
	public List<UserManagementResponse> loadUserBasedOnCity(String city) {
		List<UserManagementEntity> data1=userManagementRepository.findByCity(city);
		
			List<UserManagementResponse> response=new ArrayList<>();
			
			for(UserManagementEntity detail:data1) {
				
				UserManagementResponse details=new UserManagementResponse();
				details.setCity(detail.getCity());
				details.setCountry(detail.getCountry());
				details.setEmailId(detail.getEmailId());
				details.setGender(detail.getGender());
				details.setMobile(detail.getMobile());
				details.setName(detail.getName());
				details.setPassword(detail.getPassword());
				details.setQualification(detail.getQualification());
				
				response.add(details);
				
			}
			return response;
	}

	public List<UserManagementResponse> loadUserDetailsBasedOnGender(String gender) {
		List<UserManagementEntity> data1=userManagementRepository.findByGender(gender);
		
		List<UserManagementResponse> response=new ArrayList<>();
		
		for(UserManagementEntity detail:data1) {
			
			UserManagementResponse details=new UserManagementResponse();
			details.setCity(detail.getCity());
			details.setCountry(detail.getCountry());
			details.setEmailId(detail.getEmailId());
			details.setGender(detail.getGender());
			details.setMobile(detail.getMobile());
			details.setName(detail.getName());
			details.setPassword(detail.getPassword());
			details.setQualification(detail.getQualification());
			
			response.add(details);
			
		}
		return response;
	}

	public String changeUserPassword(String emailId, ChangePasswordRequest request) {
		
		Optional<UserManagementEntity> data=userManagementRepository.findById(emailId);
		if(data.isPresent()) {
			UserManagementEntity data1=data.get();
			if(data1.getPassword().equals(request.getOldPassword())) {
				data1.setPassword(request.getNewPassword());
				userManagementRepository.save(data1);
				return "Password change successfully";
			}else {
				return "Old password and new password not matched please try again..";
			}
		}else {
			return "Change Password Failed! Email id not found";
		}
		
	}

	public String deleteUserDetails(String emailId) {
		Optional<UserManagementEntity> data=userManagementRepository.findById(emailId);
		if(data.isPresent()) {
			UserManagementEntity data1=data.get();
			userManagementRepository.deleteById(emailId);
			return "Data deleted successdully";
		}else {
			return "Deleete Data Failed! Email id not found";
		}
	}

	public String deleteUserDetailsByCity(String city) {
		List<UserManagementEntity> data=userManagementRepository.findByCity(city);
		if(data!=null) {
			userManagementRepository.removeByCity(city);
			return "Data deleted successdully";
		}else {
			return "Delete Data Failed! Data not found";
		}
	}
	
}
