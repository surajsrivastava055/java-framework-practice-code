package com.gyan.db.operation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SelectOperation {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public void selectData() {
		
		String query="select * from student";
		List<Student> data=jdbctemplate.query(query, new BeanPropertyRowMapper<Student>(Student.class));
		for(Student st:data) {
			System.out.println(st);
		}
		
	
	}

}
