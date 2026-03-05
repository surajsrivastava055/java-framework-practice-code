package com.gyan.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("uat")
@Component
public class BeanCreationForDefault {
	
	public BeanCreationForDefault() {
		System.out.println("BeanCreation for Defalut");
	}

	
}
