package com.gyan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gyan.dto.NetBankingInfo;
import com.gyan.feignclient.PaymentServiceFeignClient;

@Service
public class OrderService {
	
	@Autowired
	PaymentServiceFeignClient paymentServiceFeignClient;

	public List<String> getAllPaymentOptions() {
		String url="http://localhost:8080/payment-service/payment/options";
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<List> data=restTemplate.exchange(url, HttpMethod.GET, null, List.class);
		
		return data.getBody();
		
	}

	public List<String> getAllPaymentOptionsV2() {
		// TODO Auto-generated method stub
		return paymentServiceFeignClient.getPaymentOption();
	}

	public String netbanking() {
		// TODO Auto-generated method stub
		NetBankingInfo data=new NetBankingInfo();
		data.setUserId("1224");
		data.setPassword("78568");
		return paymentServiceFeignClient.netBanking(data);
	}
	
	

}
