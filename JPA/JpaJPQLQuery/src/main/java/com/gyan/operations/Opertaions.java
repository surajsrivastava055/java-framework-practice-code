package com.gyan.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gyan.entity.EmployeeDetails;
import com.gyan.repository.EmployeeDetailsRepository;

@Component
public class Opertaions {
	
	@Autowired
	EmployeeDetailsRepository edr;
	
	
	//*************Native SQL Query Normal Select Operation**************
	public void getAllEmployee() {
		List<EmployeeDetails> data=edr.getAllEmployeeData();
		for(EmployeeDetails data1:data) {
			System.out.print(data1);
		}
	}
	/*
	
	//*************Native SQL Query Select Operation With Normal Where Condition**************
		public void getAllEmployee1() {
			List<EmployeeDetails> data=edr.getAllEmployeeData("Pune");
			for(EmployeeDetails data1:data) {
				System.out.print(data1);
			}
		}
	

		//*************Native SQL Query Normal Select Operation**************
		public void getAllEmployee2() {
			List<EmployeeDetails> data=edr.getAllEmployeeData("India","MALE");
			for(EmployeeDetails data1:data) {
				System.out.print(data1);
			}
		
		}
		*/
		
		/*
		//*************Native SQL Query Select Operation With Normal Where Condition**************
			public void getAllEmployee1() {
				List<EmployeeDetails> data=edr.getAllEmployeeData("Pune");
				for(EmployeeDetails data1:data) {
					System.out.print(data1);
				}
			}
		

			//*************Native SQL Query Normal Select Operation**************
			public void getAllEmployee2() {
				List<EmployeeDetails> data=edr.getAllEmployeeData("India","MALE");
				for(EmployeeDetails data1:data) {
					System.out.print(data1);
				}
			
			}
			*/
		
		//DML Operation
		// Insert data into database using Native SQL
//		public void insertData() {
//			int count=edr.insertEmployeeData(111, "Gyan", 25, 759888.0, "Bahraich", "MALE", "India");
//			System.out.println("Number of Data inserted:"+count);
//		}
//		
//		public void deleteData() {
//			int count=edr.deleteEmployeeData(111);
//			System.out.println("Number of Data inserted:"+count);
//		}

}
