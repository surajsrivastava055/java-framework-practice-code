package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gyan.db.operation.DbOperation;

@SpringBootApplication
public class FirstJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(FirstJpaApplication.class, args);
		
		DbOperation dbOperation=(DbOperation) container.getBean(DbOperation.class);
		dbOperation.insertProductDeails();
		
		
		
	}

}
