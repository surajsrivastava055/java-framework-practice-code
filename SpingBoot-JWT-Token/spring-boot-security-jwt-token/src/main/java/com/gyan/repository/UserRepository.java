package com.gyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyan.entity.UserInformationEntity;

@Repository
public interface UserRepository extends JpaRepository<UserInformationEntity, String> {

	UserInformationEntity findByEmailAndPassword(String email, String password);

}
