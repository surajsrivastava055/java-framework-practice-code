package com.gyan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyan.entity.UserManagementEntity;

@Repository
public interface UserManagementRepository extends JpaRepository<UserManagementEntity, String> {
	List<UserManagementEntity> findByCity(String city);

	List<UserManagementEntity> findByCityAndGender(String city, String gender);

	List<UserManagementEntity> findByGender(String gender);

	void removeByCity(String city);
}
