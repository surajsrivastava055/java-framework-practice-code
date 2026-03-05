package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.gyan.beans.Cart;

@SpringBootApplication
public class ConstructorInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(ConstructorInjectionApplication.class, args);
		Cart cart=(Cart)context.getBean("cart");
		System.out.println(cart);
	}

}
