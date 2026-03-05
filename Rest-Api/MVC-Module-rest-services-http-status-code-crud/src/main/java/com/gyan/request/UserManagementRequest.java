package com.gyan.request;

public class UserManagementRequest {
	
	private String name;
	private String emailId;
	private String password;
	private String mobile;
	private String city;
	private String gender;
	private String qualification;
	private String country;
	
	public UserManagementRequest() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserManagementRequest(String name, String emailId, String password, String mobile, String city,
			String gender, String qualification, String country) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.mobile = mobile;
		this.city = city;
		this.gender = gender;
		this.qualification = qualification;
		this.country = country;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "UserManagementRequest [name=" + name + ", emailId=" + emailId + ", password=" + password + ", mobile="
				+ mobile + ", city=" + city + ", gender=" + gender + ", qualification=" + qualification + ", country="
				+ country + "]";
	}

}
