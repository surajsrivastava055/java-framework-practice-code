package com.gyan.dto;

public class UserInformationResquest {
	private String name;
	private String emailId;
	private String password;
	
	public UserInformationResquest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserInformationResquest(String name, String emailId, String password) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserInformationResquest [name=" + name + ", emailId=" + emailId + ", password=" + password + "]";
	}
	
	
}
