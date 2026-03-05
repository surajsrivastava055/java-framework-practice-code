package com.gyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyan.entity.UserDetails;

@Repository
public interface UserManagementRepository extends JpaRepository<UserDetails, String> {
	public UserDetails findByEmailAndPassword(String email, String password);
}