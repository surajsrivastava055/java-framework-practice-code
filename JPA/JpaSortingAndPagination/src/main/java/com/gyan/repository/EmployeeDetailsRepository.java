package com.gyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyan.entity.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails,Integer> {

}
