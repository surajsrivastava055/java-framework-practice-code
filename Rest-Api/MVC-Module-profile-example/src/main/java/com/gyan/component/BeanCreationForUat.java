package com.gyan.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("uat")
@Component
public class BeanCreationForUat {
	
	public BeanCreationForUat() {
		System.out.println("BeanCreation for UAT");
	}

	
}
