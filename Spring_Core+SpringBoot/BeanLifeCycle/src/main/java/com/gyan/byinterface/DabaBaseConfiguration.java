package com.gyan.byinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("database")
public class DabaBaseConfiguration implements InitializingBean, DisposableBean {
	
	@Value("Gyan")
	private String userName;
	
	@Override
	public String toString() {
		return "DabaBaseConfiguration [userName=" + userName + ", userPassword=" + userPassword + "]";
	}

	@Value("Suraj123")
	private String userPassword;
	
	public DabaBaseConfiguration() {
		super();
		System.out.println("DabaBaseConfiguration Object is created.....");
	}

	public DabaBaseConfiguration(String userName, String userPassword) {
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
	public void afterPropertiesSet() throws Exception {
		 System.out.println("After Bean object creation and Configuration I am called...");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Beafore Bean object destruction I am called...");
		
	}
	
	

}
