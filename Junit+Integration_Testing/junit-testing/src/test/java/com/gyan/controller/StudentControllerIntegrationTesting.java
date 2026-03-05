package com.gyan.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.gyan.entity.Student;

import tools.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerIntegrationTesting {
	
	@Autowired
	private MockMvc mockmvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Test
	void shouldCreateStudent() throws Exception{
		
		Student stu=new Student(null,"Ankush","ankush@gmail.com",50);
		mockmvc.perform(post("/student/add")
				.contentType(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsString(stu)))
				.andExpect(status().isOk());
				//.andExpect(jsonPath("$.name").value("Ankush"));
	}
	
	@Test
	void shouldFetchStudents() throws Exception{
		
		mockmvc.perform(get("/student/getAll"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.length()").value(22));
	}
	
	
	

}
