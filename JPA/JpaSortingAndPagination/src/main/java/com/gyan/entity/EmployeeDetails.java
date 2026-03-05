package com.gyan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// it's for getter and setter now we don't need to write getter setter lombok will internally take care : import lombok.Data;
//@Data

//it's for All Parameterized Constructor now we don't need to declareParametrized Constructor lombok 
//will internally take care :import lombok.AllArgsConstructor;
//@AllArgsConstructor

//it's for Zero Parameterized Constructor now we don't need to declare Zero Parameterized Constructor lombok 
//will internally take care :import lombok.NoArgsConstructor;
//@NoArgsConstructor
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
// if table name and class name are same so @table annotation also not required here..


@Table(name="employee")
@Entity
public class EmployeeDetails {

	@Id
	@Column(name="emp_id")
	private int id;
	
	//As String name and database table name is same so @Column Annotation is no required it's optional.
	private String name;
	
	private int age;
	
	private double salary;
	
	private String city;
	
	private String gender;
	
	private String country;
	
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(int id, String name, int age, double salary, String city, String gender, String country) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
		this.gender = gender;
		this.country = country;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", city=" + city
				+ ", gender=" + gender + ", country=" + country + "]\n";
	}
	
}
