package com.gyan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class SpringBeanConfiguration {
	
	@Profile("dev")
	@Bean
	public EmailConfig devEmailConfig() {
		System.out.println("DEV: Email Config Getting Ready...");
		return new EmailConfig();
	}
	
	@Profile("uat")
	@Bean
	public EmailConfig uatEmailConfig() {
		System.out.println("UAT: Email Config Getting Ready...");
		return new EmailConfig();
	}
	
	
	@Profile("pro")
	@Bean
	public EmailConfig proEmailConfig() {
		System.out.println("PRO: Email Config Getting Ready...");
		return new EmailConfig();
	}
	
	
	@Profile("dev")
	@Bean
	public EmailConfig defaultEmailConfig() {
		System.out.println("DEFAULT: Email Config Getting Ready...");
		return new EmailConfig();
	}

}
