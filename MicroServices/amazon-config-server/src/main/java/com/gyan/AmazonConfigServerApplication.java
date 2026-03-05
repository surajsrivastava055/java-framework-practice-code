package com.gyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AmazonConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonConfigServerApplication.class, args);
	}

}
