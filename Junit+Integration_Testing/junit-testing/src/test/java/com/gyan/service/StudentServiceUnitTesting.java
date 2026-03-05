package com.gyan.service;

import com.gyan.repository.StudentRepository;
import com.gyan.entity.Student;

import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceUnitTesting {
	
	@Mock
	private StudentRepository studentRepository;
	
	@InjectMocks
	private StudentService studentService;
	
	private Student student;
	
	@BeforeEach
	void setup() {
		MockitoAnnotations.openMocks(this);
		student=new Student(null,"Sadika","sadika@gmail.com",22);
	}
	
	@Test
	void createStudent() {
		when (studentRepository.save(student)).thenReturn(student);
		Student res=studentService.addStudent(student);
		Assertions.assertEquals("Sadika",res.getName());
	}
	
	@Test
	void GetAllStudent() {
		when (studentRepository.findAll()).thenReturn(List.of(student));
		List<Student> res=studentService.getAllStudent();
		Assertions.assertEquals(25,res.size());
	}
}
