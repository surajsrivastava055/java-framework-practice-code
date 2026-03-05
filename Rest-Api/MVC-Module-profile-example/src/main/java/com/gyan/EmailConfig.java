package com.gyan;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("default")
@Component
public class EmailConfig {
	
	public EmailConfig() {
		System.out.println("EmailConfig Object Creation done");
	}

}
