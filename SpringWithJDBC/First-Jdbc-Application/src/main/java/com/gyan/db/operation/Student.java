package com.gyan.db.operation;

public class Student {
	
	private int id;
	private String name;
	private double sallary;
	
	public Student() {
		
	}
	
	public Student(int id, String name, double sallary) {
		super();
		this.id = id;
		this.name = name;
		this.sallary = sallary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSallery() {
		return sallary;
	}


	public void setSallary(double sallary) {
		this.sallary = sallary;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sallary=" + sallary + "]";
	}
	
}
