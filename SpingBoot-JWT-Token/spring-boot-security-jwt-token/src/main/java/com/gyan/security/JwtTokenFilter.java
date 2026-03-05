package com.gyan.security;

import java.io.IOException;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtTokenFilter extends OncePerRequestFilter{
	
	@Autowired
	JwtUtil jwtUtil;
	
	@Autowired
	SecurityUserAuthenticationService securityUserAuthenticationService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		// 1. Token Available or not
		// Header: Authorization(key) : this token value(value)
		String JwtToken=request.getHeader("Authorization");
		String userId=null;
		
		if(JwtToken!=null && !JwtToken.isBlank() && !JwtToken.isEmpty()) {
			
			System.out.println("OncePerRequestFilter: Token presented: Incomming Token :"+JwtToken);
			
			// Validate the token: username && token expiry
			// getting username form the token (Extracting)
			userId=jwtUtil.getUserIdFromToken(JwtToken);
			System.out.println("Request came from an user:"+userId);
			
		}else {
			System.out.println("OncePerRequestFilter: Token not presented please add token");
		}
		
		//token userid matching with request Id or not
		
		if(userId != null && SecurityContextHolder.getContext().getAuthentication()==null) {
			System.out.println("OncePerRequestFilter: getting user info from the DB by passing userId got from the token");
			
			//get user information from the database by passing userid: got from the token
			UserDetails UserDetails=securityUserAuthenticationService.loadUserByUsername(userId);
			
			// now passing user id came to the token validator
			System.out.println("OncePerRequestFilter: Now validating token is expired or not & matching user name");
			
			Boolean isValidToken=jwtUtil.isTokenValid(JwtToken, UserDetails.getUsername());
			
			System.out.println("OncePerRequestFilter Token is valid result:"+isValidToken);
			
			if(isValidToken) {
				System.out.println("OncePerRequestFilter: Setting security context for that user Id");
				
				UsernamePasswordAuthenticationToken authenticationToken= new UsernamePasswordAuthenticationToken(UserDetails, null, Collections.emptyList());
				authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				
				 SecurityContextHolder.getContext().setAuthentication(authenticationToken);
			}else {
				System.out.println("OncePerRequestFilter: Token is not valid, Try with valid token");
			}
			
		}
		filterChain.doFilter(request, response);
		
	}
	
	

}
