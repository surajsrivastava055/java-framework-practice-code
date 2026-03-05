package com.gyan.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.gyan.entity.UserInformationEntity;
import com.gyan.repository.UserRepository;

@Component
public class SecurityUserAuthenticationService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Optional<UserInformationEntity> data=userRepository.findById(email);
		if(data.isPresent()) {
			return data.get();
		}
		else {
			throw new UsernameNotFoundException("Email Id is not Found:"+email);
		}
	
	}

}
