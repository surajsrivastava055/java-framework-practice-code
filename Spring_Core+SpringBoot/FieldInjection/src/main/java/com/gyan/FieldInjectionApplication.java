package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gyan.beans.Cart;

@SpringBootApplication
public class FieldInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FieldInjectionApplication.class, args);
		Cart cart=(Cart)context.getBean("cart");
		
		System.out.println(cart);
	}

}
