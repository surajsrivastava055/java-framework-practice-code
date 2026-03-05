package com.gyan.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.gyan.entity.EmployeeDetails;
import com.gyan.repository.EmployeeDetailsRepository;

@Component
public class Opertaions {
	
	@Autowired
	EmployeeDetailsRepository edr;
	
	//*************Sorting Operation Starts**************
	
	public void findAllEmployeeDetails() {
		List<EmployeeDetails> emp=edr.findAll();
		for(EmployeeDetails data:emp) {
		System.out.print(data);
		}
	}
	
	// fetching sorted ascending order data based on employeeId
	public void findAllEmployeeDetailsByEmpID() {
		List<EmployeeDetails> emp=edr.findAll(Sort.by("id"));
		for(EmployeeDetails data:emp) {
		System.out.print(data);
		}
	}
	
	// fetching sorted ascending order data based on employeeId
	public void findAllEmployeeDetailsByEmpIDDescending() {
		List<EmployeeDetails> emp=edr.findAll(Sort.by(Direction.DESC,"id"));
		for(EmployeeDetails data:emp) {
			System.out.print(data);
		}
	}
	// fetching sorted ascending order data based on salary
	public void findAllEmployeeDetailsBySallery() {
		List<EmployeeDetails> emp=edr.findAll(Sort.by(Direction.ASC,"salary"));
		for(EmployeeDetails data:emp) {
			System.out.print(data);
		}
	}
	
	// fetching sorted ascending order data based on salary and country
	public void findAllEmployeeDetailsBySalleryAndCountry() {
		List<EmployeeDetails> emp=edr.findAll(Sort.by(Direction.ASC,"salary","country"));
		for(EmployeeDetails data:emp) {
			System.out.print(data);
		}
	}
	
	//*************Sorting Operation End**************
	
	//*************Pagination Operation Start**************
	
	//Fetch 1st 5 records from the Database
	public void findFirstNRecordsFromDb() {
		Page<EmployeeDetails> page=edr.findAll(Pageable.ofSize(5));
		List<EmployeeDetails> emp=page.getContent();
		//Or
		//List<EmployeeDetails> emp==edr.findAll(Pageable.ofSize(5)).getContent();
		for(EmployeeDetails data:emp) {
			System.out.print(data);
		}
	}
	
	//Achieve Pagination where pageNo and NoOfrecords fetch from the Database
	public void findAllDEmployeDetailsBasedOnPagination(int pageNo, int noOfRecords) {
		Page<EmployeeDetails> page=edr.findAll(PageRequest.of(pageNo, noOfRecords));
		List<EmployeeDetails> emp=page.getContent();
		for(EmployeeDetails data:emp) {
			System.out.print(data);
		}
	}
	
	//Achieve Pagination where pageNo and NoOfrecords fetch from the Database and also use sorting
	public void findAllDEmployeDetailsBasedOnPaginationSortById(int pageNo, int noOfRecords) {
		Page<EmployeeDetails> page=edr.findAll(PageRequest.of(pageNo, pageNo, Direction.DESC, "id"));
		List<EmployeeDetails> emp=page.getContent();
		for(EmployeeDetails data:emp) {
			System.out.print(data);
		}
	}
	
	
	
	
	
	
	
	//*************Pagination Operation End**************

}
