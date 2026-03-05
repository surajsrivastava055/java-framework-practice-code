package com.gyan.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.dto.CardInformationRequest;
import com.gyan.dto.NetBankingInformationRequest;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class PaymentController {
	
	//1st rest service
	@PostMapping("/payment/netbanking")
	public String netBankingPayment(@RequestBody NetBankingInformationRequest request) {
		 // service and repository implement
		//TODO:  validate user credentials: if exists: then get account numbers
		//get existing balance
		//validate paid amount should be less then existing amount...
		//TODO: entity class : create table manually.
		
		return "Payment successfully, Your Transaction ID:"+generateTransactionId();
	}
	
	// 2nd rest service
	@PostMapping("/payment/credit/card")
	public String creditCardPayment(@RequestBody CardInformationRequest request) {
		 // service and repository implement
		//TODO:  validate user credentials: if exists: then get account numbers
		//get existing balance
		//validate paid amount should be less then existing amount...
		//TODO: entity class : create table manually.
		
		return "Payment successfully, Your Transaction ID:"+generateTransactionId();
	}
	
	//3rd rest service // Which payment options it is supporting...
	@GetMapping("/payment/options")
	public List<String> getPaymentTypes() {
		 // service and repository implement
		//TODO:  validate user credentials: if exists: then get account numbers
		//get existing balance
		//validate paid amount should be less then existing amount...
		//TODO: entity class : create table manually.
		
		System.out.println("In Producer class Controller is called..");
		
		return List.of("1.Net Banking","2. Credit Card","3. Debit Card","4. UPI");
	}
	 
	public static String generateTransactionId() {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        int random = ThreadLocalRandom.current().nextInt(1000, 9999);
        return "TXN-" + timestamp + "-" + random;
    }
	
	
	@GetMapping("/validate/token")
	public String validateToken(@RequestHeader("Authorization") String Authorization, HttpServletRequest request) {
		System.out.println("Recived token for validation :"+request.getHeader("Authorization"));
		return "Valid Token";
	}


}
