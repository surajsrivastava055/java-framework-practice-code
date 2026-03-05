package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gyan.operations.Opertaions;

@SpringBootApplication
public class JpaAllCrudOperation1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(JpaAllCrudOperation1Application.class, args);
		Opertaions data=(Opertaions)container.getBean(Opertaions.class);
		
		/*
		//*************Sorting Operation Start**************
		System.out.println("-------------------Normal Data Fetching----------------------");
		data.findAllEmployeeDetails();
		
		System.out.println("------------------- Data Fetching Based on Employee Id in Ascending order----------------------");
		data.findAllEmployeeDetailsByEmpID();
		
		System.out.println("------------------- Data Fetching Based on Employee Id in Desceding order----------------------");
		data.findAllEmployeeDetailsByEmpIDDescending();
		
		System.out.println("------------------- Data Fetching Based on Employee Salary in Ascending order----------------------");
		data.findAllEmployeeDetailsBySallery();
		
		System.out.println("------------------- Data Fetching Based on Employee Salary And Country in Ascending order----------------------");
		data.findAllEmployeeDetailsBySalleryAndCountry();
		
		//*************Sorting Operation End**************
		 */
		
		//*************Pagination Operation Start**************
		
		//*************Pagination Operation End**************
		System.out.println("***************Fetch 1st 5 records from the Database************");
		data.findFirstNRecordsFromDb();
		
		System.out.println("***************Achieve Pagination where pageNo and NoOfrecords fetch from the Database************");
		data.findAllDEmployeDetailsBasedOnPagination(1,3);
		
		System.out.println("***************Achieve Pagination where pageNo and NoOfrecords fetch from the Database and sort in descending order************");
		data.findAllDEmployeDetailsBasedOnPaginationSortById(2, 4);
		
	}

}
