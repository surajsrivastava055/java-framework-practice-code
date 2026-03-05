package com.gyan.db.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class InsertDynamically {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public void insertDynamicData() {
		
		String query="insert into student values(?,?,?)";
		int data=jdbctemplate.update(query,12,"Anuj Gupta",120000);
		System.out.println("Data has been inserted successfully count:"+data);
	
	}

}
