package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.gyan.external.file.AwsConfiguration;

@PropertySource(value= {"aws-configuration.properties"})
@SpringBootApplication
public class PrimitiveValueInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(PrimitiveValueInjectionApplication.class, args);
		HardCodedValue data=(HardCodedValue) context.getBean("hardCoded");
		System.out.print(data);
		
		DynamicValue data1=(DynamicValue) context.getBean("dynamic");
		System.out.print(data1);
		
		AwsConfiguration data2=(AwsConfiguration)context.getBean("aws");
		System.out.println(data2);
		
		
	}

}
