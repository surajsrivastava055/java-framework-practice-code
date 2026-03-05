package com.gyan;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.gyan.beans.Food;

@SpringBootApplication
public class SecondConfigurationForBeanObjects {
	
	@Primary()
	@Bean("food2")
	public Food food() {
		System.out.println("Food 2nd Bean Object created");
		List<String> fooditems=new ArrayList<String>();
		fooditems.add("Mango");
		fooditems.add("Apple");
		Food food=new Food(2, fooditems);
		return food;
	}

}
