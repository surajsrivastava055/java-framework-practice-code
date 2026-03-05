package com.gyan;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hardCoded")
public class HardCodedValue {
	
	@Value("1234")
	private int port;
	
	@Value("google.com")
	private String url;
	
	@Value("gyan")
	private String userName;
	
	@Value("gyan")
	private String userPassword;
	
	@Value("HR, Admin, Manager")
	private List<String> items;
	
	
	public List<String> getItems() {
		return items;
	}


	public void setItems(List<String> items) {
		this.items = items;
	}


	public HardCodedValue(int port, String url, String userName, String userPassword, List<String> items) {
		super();
		System.out.println("HardCodedValue Parametrized constructor Called...");
		this.port = port;
		this.items=items;
		this.url = url;
		this.userName = userName;
		this.userPassword = userPassword;
	}


	public HardCodedValue() {
		super();
		System.out.println("HardCodedValue default constructor Called...");
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
		return "\nHardCodedValue [port=" + port + ", url=" + url + ", userName=" + userName + ", userPassword="
				+ userPassword + ", items=" + items + "]";
	}
	
	
	
	
	
	

}
