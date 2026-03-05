package com.gyan.service;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.gyan.entity.Student;
import com.gyan.repository.StudentRepository;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentServiceIntegrationTesting {
	
//************************This is a Integration test case start**************************	
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired 
	private StudentService studentService;
	
	@Test
	@Order(1)
	void shouldAddStudentSuccessfully() {
		System.out.println("****************test case 1*****************");
		Student stu=new Student(50,"shubham kolar","shubham1@gmail.com",24);
		Student response=studentService.addStudent(stu);
		assertNotNull(response.getId());
		assertEquals(stu.getEmail(),response.getEmail());
	}
	
	@Test
	@Order(2)
	void shouldFetchStudents() {
		System.out.println("****************test case 2*****************");
		List<Student> response=studentService.getAllStudent();
		assertEquals(17,response.size());
	}
	
	@Test
	@Order(3)
	void shouldFetchStudentsById() {
		System.out.println("****************test case 3*****************");
		Student response=studentService.findById(8);
		assertEquals(8,response.getId());
	}
	@BeforeEach
	void setup() {
		System.out.println("****************Started test cases*****************");
	}
	
	@AfterEach
	void setup1() {
		System.out.println("****************Ended test cases*****************");
	}
	
	@BeforeAll
	static void setup2() {
		System.out.println("****************Started test cases Before All*****************");
	}
	
	@AfterAll
	static void setup3() {
		System.out.println("****************Ended test cases After All*****************");
	}
	
//************************Integration test case End**************************	

	
}
