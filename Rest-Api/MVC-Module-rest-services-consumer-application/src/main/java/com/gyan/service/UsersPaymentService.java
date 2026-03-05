package com.gyan.service;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gyan.dto.NetBankingDetailsDto;

@Service
public class UsersPaymentService {
	
	public List<String> getAllPaymentOptions() {
		System.out.println("In service layer consumer application getting data from Produser application");
		
		// need to call service:  http://localhost:8080/payment/api/payment/options
		//Method: GET
		//Request Body-No
		//Header -No
		//QueryParameter - No
		//Media Type - */*
		//Response Body - JSON ARRAY STRING
		

		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<List> data=restTemplate.getForEntity("http://localhost:8080/payment/api/payment/options", List.class);
		List<String> data1=data.getBody();
		
		return data1;
		
	}

	public String callNetBanking() {
		
System.out.println("In service layer consumer application getting data from Produser application");
		
		// need to call service:  http://localhost:8080/payment/api/payment/netbanking
		//Method: POST
		//Request Body-Yes
		//{
				//"userName": "Jay",
				//"password": "gyan123",
				//"amountToBePaid": 22222
		//}
		//Header -No
		//QueryParameter - No
		//Media Type - */*
		//Response Body - String

		String url="http://localhost:8080/payment/api/payment/netbanking";
		//Preparing requestBody
		NetBankingDetailsDto data=new NetBankingDetailsDto();
		data.setUserName("Jay");
		data.setPassword("gyan123");
		data.setAmountToBePaid(22222);
		
		HttpEntity<NetBankingDetailsDto> httpEntity=new HttpEntity<NetBankingDetailsDto>(data);
		
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<String> data1=restTemplate.exchange(url, HttpMethod.POST,httpEntity,String.class);
		
		return data1.getBody();
	}

	public String validateToken() {
		System.out.println("Service Consumer called...");
		// TODO Auto-generated method stub
		String url="http://localhost:8080/payment/api/validate/token";
		String token=UUID.randomUUID().toString();
		System.out.println("Token"+token);
		HttpHeaders header=new HttpHeaders();
		header.set("Authorization", token);
		//HttpEntity<Object> httpEntity=new HttpEntity<>(header);
		HttpEntity<String> httpEntity=new HttpEntity<>(header);
		
		RestTemplate rest=new RestTemplate();
		return rest.exchange(url, HttpMethod.GET, httpEntity, String.class).getBody();	
	}

	
}
