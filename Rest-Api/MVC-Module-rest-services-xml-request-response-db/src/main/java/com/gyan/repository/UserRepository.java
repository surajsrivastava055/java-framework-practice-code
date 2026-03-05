package com.gyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyan.entity.UserDetailsEntity;

@Repository
public interface UserRepository extends JpaRepository<UserDetailsEntity,String>{
	
	public UserDetailsEntity findByEmailIdAndPassword(String emailId,String password);
}
