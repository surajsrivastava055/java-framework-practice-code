package com.gyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyan.entity.UserInformation;

@Repository
public interface UserRepository extends JpaRepository<UserInformation, String> {

}
