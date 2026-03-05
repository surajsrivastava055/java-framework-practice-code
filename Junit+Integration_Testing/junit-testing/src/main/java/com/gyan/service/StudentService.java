package com.gyan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyan.entity.Student;
import com.gyan.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public Student addStudent(Student student) {
		System.out.println("Inside Student Service...");
		student.setId(null);
		Student response=studentRepository.save(student);
		return response;
		
	}

	public List<Student> getAllStudent() {
		System.out.println("Inside Student Service...");
		List<Student> response=studentRepository.findAll();
		return response;
	}

	public Student findById(int id) {
		System.out.println("Inside Student Service...");
		Optional<Student> response=studentRepository.findById(id);
		return response.get();
	}

	public String deleteById(int id) {
		System.out.println("Inside Student Service...");
		studentRepository.deleteById(id);
		return "Deleted successfully...";
	}
	
	
	

}
