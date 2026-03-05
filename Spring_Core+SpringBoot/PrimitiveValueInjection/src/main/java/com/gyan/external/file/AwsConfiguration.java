package com.gyan.external.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aws")
public class AwsConfiguration {
	
	@Value("${aws.port.number}")
	private int port;
	
	@Value("${aws.url}")
	private String url;
	
	@Value("${aws.user.name}")
	private String userName;
	
	// Adding default Value if not get from .properties file then inject default value instead of showing Exception :suraj123,
	@Value("${aws.user.password:suraj123}")
	private String userPassword;
	


	public AwsConfiguration(int port, String url, String userName, String userPassword) {
		super();
		System.out.println("DynamicValue Parametrized constructor Called...");
		this.port = port;
		this.url = url;
		this.userName = userName;
		this.userPassword = userPassword;
	}


	public AwsConfiguration() {
		super();
		System.out.println("DynamicValue default constructor Called...");
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
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
		return "\nAwsConfiguration [port=" + port + ", url=" + url + ", userName=" + userName + ", userPassword="
				+ userPassword + "]";
	}
	
}


