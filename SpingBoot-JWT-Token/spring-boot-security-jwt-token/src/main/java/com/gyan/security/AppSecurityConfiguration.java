package com.gyan.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class AppSecurityConfiguration {
	@Autowired
	JwtTokenFilter jwtTokenFilter;
	
	@Bean
	BCryptPasswordEncoder getBCryptPasswordEncoder() {
		System.out.println("BCryptPasswordEncoder: Intance created..");
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	AuthenticationManager getAuthenticationManager(AuthenticationConfiguration authenticationConfiguration) throws BadCredentialsException{
		System.out.println("Creating an Instance of AuthenticationManager");
		return authenticationConfiguration.getAuthenticationManager();
	}
	
	@Bean
	public SecurityFilterChain securityConfig(HttpSecurity httpSecurity) {
		
		System.out.println("AppSecurityConfiguration: Configuration the security rules:");
		
		httpSecurity.csrf(csrf -> csrf.disable()) // other side can not send the request
					.cors(cors -> cors.disable()) //
					.authorizeHttpRequests(
							reqs -> reqs.requestMatchers("/public/**","/help/**") //
							.permitAll() // no security // no filter token //  skip the security check
							.anyRequest()
							.authenticated() // security // filter token //  security check
							).addFilterBefore(this.jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
		return httpSecurity.build();
	} 
	
}
