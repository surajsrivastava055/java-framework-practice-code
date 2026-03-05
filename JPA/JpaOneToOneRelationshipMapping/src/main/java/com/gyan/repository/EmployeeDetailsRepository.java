package com.gyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyan.entity.Employee;

public interface EmployeeDetailsRepository extends JpaRepository<Employee, Integer> {

}
