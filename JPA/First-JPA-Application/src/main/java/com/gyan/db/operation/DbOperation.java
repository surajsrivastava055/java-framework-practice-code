package com.gyan.db.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gyan.entity.ProductDetails;
import com.gyan.repository.ProductDetailsRepository;

@Component
public class DbOperation {
	
	@Autowired
	ProductDetailsRepository pdr;
	
	//Inserting data into product table...
	public void insertProductDeails() {	
		ProductDetails pd=new ProductDetails();
		pd.setId(1);
		pd.setName("Gyan");
		pd.setSallary(74000.43);
		
		pdr.save(pd);
		System.out.println("Data Inserted/Added Successfully");	
	}
	
	

}
