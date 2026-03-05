package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gyan.beans.Car;

@SpringBootApplication
public class DependencyInjectionViaInterfaceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependencyInjectionViaInterfaceApplication.class, args);
		Car car=(Car)context.getBean("car");
		System.out.println(car);
	}
}
