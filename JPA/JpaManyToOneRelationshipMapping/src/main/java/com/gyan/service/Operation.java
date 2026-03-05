package com.gyan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gyan.entity.Department;
import com.gyan.entity.Employee;
import com.gyan.repository.DepartmentRepository;
import com.gyan.repository.EmployeeDetailsRepository;

@Component
public class Operation {
	
	@Autowired
	EmployeeDetailsRepository edr;
	
	@Autowired
	DepartmentRepository dr;
	
	public void saveData() {
		Department d1=new Department(1,"HR");
		dr.save(d1);
		
		Employee emp1=new Employee(100,"Gyan","M",d1);
		edr.save(emp1);
		
		Employee emp2=new Employee(101,"Anuj","M",d1);
		edr.save(emp2);
		
		Employee emp3=new Employee(102,"Sadika","F",d1);
		edr.save(emp3);
		
		Department d2=new Department(2,"DEV");
		dr.save(d2);
		
		Employee emp4=new Employee(104,"Jay","M",d2);
		edr.save(emp4);
		
	}
	

}
