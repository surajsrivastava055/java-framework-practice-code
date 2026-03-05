package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gyan.crud.operations.CrudOperations;

@SpringBootApplication
public class JpaAllCrudOperationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container= SpringApplication.run(JpaAllCrudOperationApplication.class, args);
		CrudOperations crudOperations=(CrudOperations)container.getBean(CrudOperations.class);
		//crudOperations.insertSingleRecord();
		//crudOperations.insertMultipleRecords();
		//crudOperations.loadAllEmployeeDetails();
		//crudOperations.loadAllEmployeeDetailsBasedOnId();
		//crudOperations.loadAllEmployeeDetailsBasedOnCityAndGender("pune","Male");
		//crudOperations.deleteEmployeeDataBasedOnId(3);
		//crudOperations.deleteAllEmployeeData();
		//crudOperations.deleteAllEmployeeDataBasedOnCity("London");
		//crudOperations.deleteAllEmployeeDataBasedOnFilteredList();	
		//crudOperations.updateDataBasedOnEmployeeId(3);
	}

}
