package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gyan.service.Operation;

@SpringBootApplication
public class JpaOneToOneRelationshipMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(JpaOneToOneRelationshipMappingApplication.class, args);
		Operation op=(Operation)container.getBean(Operation.class);
//		op.saveData();
//		op.readData();
//		op.delateData(1);
		op.updateData();
	}

}
