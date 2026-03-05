package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gyan.byannotation.EmailConfiguration;
import com.gyan.byinterface.DabaBaseConfiguration;

@SpringBootApplication
public class BeanLifeCycleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container= SpringApplication.run(BeanLifeCycleApplication.class, args);
		
		DabaBaseConfiguration data= (DabaBaseConfiguration)container.getBean("database");
		System.out.println(data);
		
		EmailConfiguration data1= (EmailConfiguration)container.getBean("email");
		System.out.println(data1);
		
	}

}
