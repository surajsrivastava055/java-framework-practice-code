package com.gyan.db.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class InsertOperation {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void addStudent() {
		
		String query="insert into student values(2,'Suraj',700000)";
		jdbcTemplate.update(query);
		
	}

}
