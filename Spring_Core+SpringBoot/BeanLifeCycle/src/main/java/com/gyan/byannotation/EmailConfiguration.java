package com.gyan.byannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("email")
public class EmailConfiguration {
	
	@Value("Gyan")
	private String userName;

	@Value("Suraj123")
	private String userPassword;
	
	@PostConstruct
	public void creationBeanConfiguration() {
		System.out.println("After Bean object creation and Configuration I am called...");
	}
	
	@PreDestroy
	public void beforeBeandestroy(){
		System.out.println("Beafore Bean object destruction I am called...");
		
	}
	
	public EmailConfiguration() {
		super();
		System.out.println("EmailConfiguration Object is created.....");
	}

	public EmailConfiguration(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "EmailConfiguration [userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	

}
