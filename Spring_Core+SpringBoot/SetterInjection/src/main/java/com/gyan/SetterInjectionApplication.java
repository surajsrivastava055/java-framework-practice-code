package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.gyan.beans.Cart;

@SpringBootApplication
public class SetterInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SetterInjectionApplication.class, args);
		Cart cart=(Cart)context.getBean("cart");
		System.out.println(cart);
	}
	
}
