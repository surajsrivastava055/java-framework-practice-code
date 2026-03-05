package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gyan.singleton.Cart;
import com.gyan.singleton.Food;

import com.gyan.prototype.Cart1;
import com.gyan.prototype.Food1;

@SpringBootApplication
public class BeanScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(BeanScopeApplication.class, args);
		
		// For Singleton Scope...
		System.out.print("****************** Singleton Scope Example ******************");
		Food food=(Food)context.getBean("food");
		System.out.println("\n"+food);
		
		Food food1=(Food)context.getBean("food");
		System.out.println(food1);
		
		Food food2=(Food)context.getBean("food");
		System.out.println(food2);
		
		
		
		Cart cart1=(Cart)context.getBean("cart");
		System.out.println(cart1);
		
		Cart cart2=(Cart)context.getBean("cart");
		System.out.println(cart2);
		
		System.out.println(cart1.getFood());
		System.out.println(cart1.getFood());
		
		
		// For Prototype Scope...
		System.out.print("****************** Prototype Scope Example ******************\n");
		Food1 foodProtoype=(Food1)context.getBean("food1");
		System.out.println(foodProtoype);
				
		Food1 foodProtoype1=(Food1)context.getBean("food1");
		System.out.println(foodProtoype1);
				
		Food1 foodProtoype2=(Food1)context.getBean("food1");
		System.out.println(foodProtoype2);
				
				
				
		Cart1 cartPrototype1=(Cart1)context.getBean("cart1");
		System.out.println(cartPrototype1);
				
		Cart1 cartPrototype2=(Cart1)context.getBean("cart1");
		System.out.println(cartPrototype2);
				
		System.out.println(cartPrototype1.getFood());
		System.out.println(cartPrototype1.getFood());
		
		
		
	}

}
