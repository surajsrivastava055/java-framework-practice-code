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
		System.out.println("*************Native SQL Query Normal Select Operation**************");
		data.getAllEmployee();
		
		System.out.println("################## By using Index Query Paramer Start #################");
		
		System.out.println("*************Native SQL Query Select Operation with Where Condition**************");
		data.getAllEmployee1();
		
		System.out.println("*************Native SQL Query Select Operation with Where Condition**************");
		data.getAllEmployee1();
		
		System.out.println("*************Native SQL Query Select Operation with multiple Where Condition**************");
		data.getAllEmployee2();
		
		System.out.println("################## By using Index Query Paramer End #################");
		*/
		
		/*
		System.out.println("################## By using Named Query Paramer Start #################");
		
		System.out.println("*************Native SQL Query Select Operation with Where Condition**************");
		data.getAllEmployee1();
		
		System.out.println("*************Native SQL Query Select Operation with multiple Where Condition**************");
		data.getAllEmployee2();
		
		System.out.println("################## By using Named Query Paramer End #################");
		*/
		
		System.out.println("################## DML Operation Start #################");
		//data.insertData();
		data.deleteData();
		// Same way perform update operation...
		
		

		
		
	}

}
