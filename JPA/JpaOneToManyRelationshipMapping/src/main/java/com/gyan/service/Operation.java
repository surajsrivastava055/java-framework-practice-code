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
		Address add1=new Address("Barabanki",765577,"India");
		Address add2=new Address("LKO",765577,"India");
		Address add3=new Address("Bahraich",765577,"India");
		Employee emp=new Employee("Anuj","Male",List.of(add1,add2,add3));
		edr.save(emp);
	}
	
	public void readData(int data) {
		Employee d=edr.findById(data).get();
		System.out.println(d);
	}
	
	public void delateData(int id) {
		edr.deleteById(id);
	}
	
	// we can perform this operation by giving id here id is autogenrated to not able to pass the same id....
//	public void updateData() {
//		
//		Employee emp=new Employee("Anuj","Male",new Address("Barabanki",765577,"India"));
//		edr.save(emp);
//		
//		
//	}

}
