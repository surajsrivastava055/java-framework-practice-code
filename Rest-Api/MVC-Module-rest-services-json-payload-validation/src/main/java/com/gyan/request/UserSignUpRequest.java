package com.gyan.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserSignUpRequest {
	@Size(min=5,max=40, message="firstName should be belong between 5 to 40 characters")
	@NotNull(message="Value should not be null")
	@NotBlank(message="Value should not be blank")
	private String firstName;
	
	@Size(min=5,max=40, message="lastName should be belong between 5 to 40 characters")
	@NotBlank
	@NotNull
	private String lastName;
	
	@NotBlank
	@NotNull
	private String password;
	
	// @Email  OR
	@Pattern(regexp="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",message="Enter valid email")
	@NotBlank(message="Mail should not blank")
	@NotNull
	private String mailId;
	
	@NotNull(message="phoneNumber should not null")
	private long phoneNumber;
	
	@NotBlank
	@NotNull
	private String address;
	
	private long pincode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "UserSignUpRequest [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", mailId=" + mailId + ", phoneNumber=" + phoneNumber + ", address=" + address + ", pincode="
				+ pincode + "]";
	}
	
}
