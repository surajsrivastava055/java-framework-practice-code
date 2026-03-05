package com.gyan.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class BeanCreation {
	
	public BeanCreation() {
		System.out.println("BeanCreation constructor called");
	}

	
}
