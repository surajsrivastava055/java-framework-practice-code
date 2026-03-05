package com.gyan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="user_information_data")
public class UserInformationEntity implements UserDetails{
	
	@Id
	private String email;
	private String password;
	private String mobileNumber;
	private String name;
	
	public UserInformationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInformationEntity(String email, String password, String mobileNumber, String name) {
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
		return "UserInformationEntity [email=" + email + ", password=" + password + ", mobileNumber=" + mobileNumber
				+ ", name=" + name + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return email;
	}
}
