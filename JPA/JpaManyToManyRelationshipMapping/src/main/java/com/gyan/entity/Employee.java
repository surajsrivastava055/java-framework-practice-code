package com.gyan.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_details")
public class Employee {
	
	@Id
	private int eid;
	
	private String ename;
	private String gender;
	
	
	//Defining relationship
	//Entity class of address table.
	@ManyToMany()
	@JoinTable(name="employee_role",joinColumns=@JoinColumn(name="emp_id"),inverseJoinColumns=@JoinColumn(name="role_id"))
	private List<Roles> roles;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int eid,String ename, String gender,List<Roles> roles) {
		super();
		this.eid=eid;
		this.ename = ename;
		this.gender = gender;
		this.roles = roles;
	}


	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Roles> getAddress() {
		return roles;
	}
	public void setCountry(List<Roles> roles) {
		this.roles = roles;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", gender=" + gender + ", roles=" + roles + "]";
	}
	
	
	
}
