package com.gyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gyan.service.UserManagementService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserRegistrationController {
	
	@Autowired
	UserManagementService userManagementService;
	
	// showing the signup page to the clint...
	@RequestMapping(method=RequestMethod.GET, path="/signup")
	public String openForm() {
		System.out.println("openForm() method called and execution is in progress...");
		return "signupForm";
	}
	
	// For signup request handling..
	@RequestMapping(method=RequestMethod.POST, path="/account/registration")
	public ModelAndView registration(HttpServletRequest req) {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String psw=req.getParameter("psw");
		System.out.println("User Details Name:"+name+", Email:"+email+", "+"Password:"+psw);
		
		//Service layer
		//can we insert data into DB, yes we can  but it's not recommended..
		
		//Sending the data to service 
		String result=userManagementService.signupService(name, email, psw);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("message");
		mv.addObject("response",result);
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/signin")
	public ModelAndView openLoginForm() {
		System.out.println("openLoginForm() method called and execution is in progress...");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("signinForm");
		return modelAndView;
	}
	
	// For Login request handling..
	@RequestMapping(method=RequestMethod.POST, path="/account/login")
	public ModelAndView login(HttpServletRequest req) {
		
		String email=req.getParameter("email");
		String psw=req.getParameter("psw");
		System.out.println("User Details Email:"+email+", "+"Password:"+psw);
		
		//Service layer
		//can we insert data into DB, yes we can  but it's not recommended..
		
		//Sending the data to service 
		String result=userManagementService.signInService(email,psw);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("message");
		mv.addObject("response",result);
		return mv;
	}
	
	

}
