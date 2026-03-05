package com.gyan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyan.entity.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails,Integer> {
	public List<EmployeeDetails> findByCity(String city);
	public List<EmployeeDetails> findByCityAndGender(String city,String gender);
	public void deleteByCity(String city);
}
