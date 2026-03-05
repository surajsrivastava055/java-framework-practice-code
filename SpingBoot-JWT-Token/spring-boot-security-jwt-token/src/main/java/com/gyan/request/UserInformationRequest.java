package com.gyan.request;

public class UserInformationRequest {
	

	private String email;
	private String password;
	private String mobileNumber;
	private String name;
	
	public UserInformationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInformationRequest(String email, String password, String mobileNumber, String name) {
		super();
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "UserInformationRequest [email=" + email + ", password=" + password + ", mobileNumber=" + mobileNumber
				+ ", name=" + name + "]";
	}
	
	
	

}
