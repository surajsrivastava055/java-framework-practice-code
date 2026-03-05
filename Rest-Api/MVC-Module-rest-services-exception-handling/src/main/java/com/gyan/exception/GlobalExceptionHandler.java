package com.gyan.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;
//exceptions
@ControllerAdvice
public class GlobalExceptionHandler {
	//exception handler method for :  MethodArgumentNotValidException
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, HttpServletRequest request){
		
		//Map<String,String> data1=new HashMap<>();
		//data1.put(ex.getFieldError().getField(),ex.getFieldError().getCode());
		
		//OR
		List<FieldError> error=ex.getFieldErrors();
		List<String> validator=error.stream().map(e->e.getField()+":"+e.getDefaultMessage()).toList();
		return ResponseEntity.badRequest().body(validator);
	}
	
	//exception handler method for :  NullPointerException
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<?> handleNullPointerException(NullPointerException ex, HttpServletRequest request){	
		return ResponseEntity.internalServerError().body("Soory we are experiencing some issue, Please try again");
	}
	
}
