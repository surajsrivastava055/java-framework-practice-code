package com.gyan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gyan.entity.Employee;
import com.gyan.entity.Roles;
import com.gyan.repository.EmployeeDetailsRepository;
import com.gyan.repository.RoleRepository;

@Component
public class Operation {
	
	@Autowired
	EmployeeDetailsRepository edr;
	
	@Autowired
	RoleRepository rr;
	
	public void saveData() {
//		Roles r1=new Roles(1,"DEV");
//		Roles r2=new Roles(2,"LEAD");
//		Roles r3=new Roles(3,"PANEL");
//		rr.save(r1);
//		rr.save(r2);
//		rr.save(r3);
//		
//		Employee emp1=new Employee(100,"Gyan","Male",List.of(r1,r2,r3));
//		edr.save(emp1);
		
		Roles r2=new Roles(4,"LEAD");
		Roles r3=new Roles(5,"PANEL");
		rr.save(r2);
		rr.save(r3);
		
		Employee emp1=new Employee(101,"Anuj","Male",List.of(r2,r3));
		edr.save(emp1);
		
		
	}
	

}
