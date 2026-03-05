package com.gyan.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.gyan.entity.Student;
import com.gyan.service.StudentService;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

@WebMvcTest(StudentController.class)
public class StudentControllerUnitTesting {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@MockitoBean
	private StudentService studentService;

	
	@Test
	void testCreateStudent() throws JacksonException, Exception {
		Student stu=new Student(null,"Ankush","ankush@gmail.com",50);
		
		when (studentService.addStudent(any(Student.class))).thenReturn(stu);
		
		mockMvc.perform(post("/student/add")
				.contentType(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsString(stu)))
				.andExpect(status().isOk());
				//.andExpect(jsonPath("$.name").value("Ankush"));
	}

}
