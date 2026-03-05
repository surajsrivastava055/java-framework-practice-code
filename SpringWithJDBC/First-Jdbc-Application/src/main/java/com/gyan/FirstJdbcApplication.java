package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gyan.db.operation.DeleteOperation;
import com.gyan.db.operation.InsertDynamically;
import com.gyan.db.operation.InsertOperation;
import com.gyan.db.operation.SelectOperation;

@SpringBootApplication
public class FirstJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(FirstJdbcApplication.class, args);
//		InsertOperation insertOperation=(InsertOperation)container.getBean(InsertOperation.class);
//		DeleteOperation deleteOperation=(DeleteOperation)container.getBean(DeleteOperation.class);
//		insertOperation.addStudent();
//		deleteOperation.deleteStudent();
		
//		InsertDynamically id= (InsertDynamically)  container.getBean(InsertDynamically.class);
//		id.insertDynamicData();
		
		SelectOperation sd= (SelectOperation)  container.getBean(SelectOperation.class);
		sd.selectData();
		
	}

}
