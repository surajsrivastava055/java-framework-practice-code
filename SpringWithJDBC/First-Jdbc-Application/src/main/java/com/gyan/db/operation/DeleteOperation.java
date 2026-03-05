package com.gyan.db.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DeleteOperation {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void deleteStudent() {
		
		String query="delete from student where id=1";
		jdbcTemplate.update(query);
		
	}

}
