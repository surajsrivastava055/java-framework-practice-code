package com.gyan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gyan.entity.Address;
import com.gyan.entity.Employee;
import com.gyan.repository.EmployeeDetailsRepository;

@Component
public class Operation {
	
	@Autowired
	EmployeeDetailsRepository edr;
	
	public void saveData() {
		Employee emp=new Employee("Anuj","Male",new Address("Barabanki",765577,"India"));
		edr.save(emp);
	}
	
	public void readData() {
		List<Employee> data=edr.findAll();
		System.out.println(data);
	}
	
	public void delateData(int id) {
		edr.deleteById(id);
	}
	
	// we can perform this operation by giving id here id is autogenrated to not able to pass the same id....
	public void updateData() {
		
		Employee emp=new Employee("Anuj","Male",new Address("Barabanki",765577,"India"));
		edr.save(emp);
		
		
	}

}
