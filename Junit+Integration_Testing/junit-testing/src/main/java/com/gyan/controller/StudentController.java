package com.gyan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.entity.Student;
import com.gyan.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addStudent(@RequestBody Student student){
		System.out.println("Inside StudentController");
		Student response=studentService.addStudent(student);
		if(student.getId()!=response.getId()) {
			return new ResponseEntity<>("Data Already present",HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<>("Data added successfully",HttpStatus.OK);
		}
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAllStudent(){

		List<Student> response= studentService.getAllStudent();
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
	

	@GetMapping("/getById/{id}")
	public ResponseEntity<Student> findById(@PathVariable int id){

		Student response= studentService.findById(id);
		if(response==null) {
			return new ResponseEntity<>(response,HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(response,HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id){
		String response=studentService.deleteById(id);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	
	

}
