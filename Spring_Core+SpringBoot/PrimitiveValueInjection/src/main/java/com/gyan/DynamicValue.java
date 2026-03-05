package com.gyan;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dynamic")
public class DynamicValue {
	
	@Value("${db.port.number}")
	private int port;
	
	@Value("${db.url}")
	private String url;
	
	@Value("${db.user.name}")
	private String userName;
	
	// Adding default Value if not get from .properties file then inject default value instead of showing Exception :suraj123,
	@Value("${db.user.password:suraj123}")
	private String userPassword;
	
	// Adding default Value if not get from .properties file then inject default value instead of showing Exception :HR, Admin, Manager
	@Value("${db.user.items:HR,Admin,Manager}")
	private List<String> items;
	
	
	public List<String> getItems() {
		return items;
	}


	public void setItems(List<String> items) {
		this.items = items;
	}


	public DynamicValue(int port, String url, String userName, String userPassword, List<String> items) {
		super();
		System.out.println("DynamicValue Parametrized constructor Called...");
		this.port = port;
		this.url = url;
		this.items=items;
		this.userName = userName;
		this.userPassword = userPassword;
	}


	public DynamicValue() {
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
		return "\nDynamicValue [port=" + port + ", url=" + url + ", userName=" + userName + ", userPassword="
				+ userPassword + ", items=" + items + "]";
	}
	
}

