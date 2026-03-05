package com.gyan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employi_dtl")
public class Employee {
	
	@Id
	private int eid;
	
	private String ename;
	private String gender;
	
	
	//Defining relationship
	//Entity class of address table.
	@ManyToOne()
	@JoinColumn(name="eid.did")
	private Department department;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int eid,String ename, String gender,Department department) {
		super();
		this.eid=eid;
		this.ename = ename;
		this.gender = gender;
		this.department = department;
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
	public Department getAddress() {
		return department;
	}
	public void setCountry(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", gender=" + gender + ", department=" + department + "]";
	}
	
	
	
}
