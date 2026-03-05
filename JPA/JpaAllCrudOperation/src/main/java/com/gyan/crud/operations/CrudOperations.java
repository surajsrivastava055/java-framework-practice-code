package com.gyan.crud.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gyan.entity.EmployeeDetails;
import com.gyan.repository.EmployeeDetailsRepository;

import jakarta.transaction.Transactional;

@Component
public class CrudOperations {
	
	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;
	
	//###################### Data InsertionOpertaion ###################
	
	// Inserting Single record into Employee table
	public void insertSingleRecord() {
		EmployeeDetails employeeDetails=new EmployeeDetails(1,"gyan",26,760000.0,"Pune","Male","India");	
		employeeDetailsRepository.save(employeeDetails);
		System.out.println("Data has been inserted Successfully...");
	}
	
	// Inserting Multiple record at a same time into Employee table
	public void insertMultipleRecords() {
		List<EmployeeDetails> data=new ArrayList<EmployeeDetails>();
		data.add(new EmployeeDetails(2,"Anuj",20,760000.0,"Pune","Male","India"));
		data.add(new EmployeeDetails(3,"Jay",27,60000.0,"Pune","Male","India"));
		data.add(new EmployeeDetails(4,"Sadika",36,960000.0,"Pune","Female","Nepal"));
		data.add(new EmployeeDetails(5,"Krishna",46,7060000.0,"Pune","Male","India"));
		data.add(new EmployeeDetails(6,"Shubham",76,7600000.0,"London","Male","England"));
		data.add(new EmployeeDetails(7,"Kartikey",29,780000.0,"Pune","Female","India"));
		data.add(new EmployeeDetails(8,"Anurag",20,720000.0,"Tokiyo","Male","Japan"));
		data.add(new EmployeeDetails(9,"Ankush",18,790000.0,"Pune","Male","Russia"));
		data.add(new EmployeeDetails(10,"Prashant",60,730000.0,"Pune","Male","India"));
		
		employeeDetailsRepository.saveAll(data);
		System.out.println("Data has been inserted Successfully...");
	}
	
	//###################### Read Operation ###################
	
	// Select/Read/Load All the Data from the table
	// select * from employee
	public void loadAllEmployeeDetails() {
		List<EmployeeDetails> data=employeeDetailsRepository.findAll();
		System.out.println(data);
	}
	
	// Select/Read/Load The Data from the table Based on the id
	// select * from employee where id=2;
	public void loadAllEmployeeDetailsBasedOnId() {
		Optional<EmployeeDetails> data=employeeDetailsRepository.findById(6);
		EmployeeDetails data1= data.get();
		System.out.println(data1);
	}
	
	// Select/Read/Load The Data from the table Based on the city/country
	// select * from employee where city="pune";
	public void loadAllEmployeeDetailsBasedOnCity(String city) {
		List<EmployeeDetails> data=employeeDetailsRepository.findByCity(city);
		System.out.println(data);
	}
	
	// Select/Read/Load The Data from the table Based on the city and gender=Male
	// select * from employee where city="pune" and gender="MALE";
	public void loadAllEmployeeDetailsBasedOnCityAndGender(String city,String gender) {
		List<EmployeeDetails> data=employeeDetailsRepository.findByCityAndGender(city,gender);
		System.out.println(data);
	}
	
	//###################### DELETE Operation ###################
	//Delete data of an employee based on employee id.
	public void deleteEmployeeDataBasedOnId(int id) {
		employeeDetailsRepository.deleteById(id);
		System.out.println("Data has been deleted successfully..");
	}
	
	//delete all the data from the employee table.
	public void deleteAllEmployeeData() {
		employeeDetailsRepository.deleteAll();
		System.out.println("All Data has been deleted successfully..");
	}
	
	//Delete data based on non-primary key...
	@Transactional
	public void deleteAllEmployeeDataBasedOnCity(String city) {
		employeeDetailsRepository.deleteByCity(city);
		System.out.println("All Data based on city has been deleted successfully Total Data Deleted: ");
	}
	
	//Delete data which is filtered in the ArrayList...
	public void deleteAllEmployeeDataBasedOnFilteredList() {
		List<EmployeeDetails> data=new ArrayList<EmployeeDetails>();
		data=employeeDetailsRepository.findByCityAndGender("pune", "Female");
		employeeDetailsRepository.deleteAll(data);
		System.out.println("All Filtered data has been deleted successfully");
	}
	
	//###################### UPDATE Operation ###################
	
	// Update the Salary based on the emp_id...
	public void updateDataBasedOnEmployeeId(int id) {
		Optional<EmployeeDetails> data=employeeDetailsRepository.findById(id);
		if(data.isPresent()) {
			EmployeeDetails data1=data.get();
			data1.setSalary(10000000.977);
			employeeDetailsRepository.save(data1);
			System.out.println("Data Updated Successfully");
		}else {
			System.out.println("Data Not Found");
		}
	}
	
	//Rest Will Try by yourself....
	
	
	
	
	

}
