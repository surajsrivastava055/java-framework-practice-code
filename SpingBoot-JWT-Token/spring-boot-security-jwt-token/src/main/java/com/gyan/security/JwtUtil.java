package com.gyan.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
	// Secret key
	private final String SECRET_KEY="ahjgjkgfthvjkgfktdkufthgligyufkuytfkufuyftkftukffkyktkfutftfkytftffttkftutkufttffdkutuktftfrik7yutfkt";
	//Expiry duration in milliseconds
	private final int TOKEN_EXPIRY_DURATION=5*60*1000; // 1 second=1000 milliseconds
	
	//Getting secret key Via hmacSha
	private SecretKey getSecretKey() {
		byte[] keyBytes=Decoders.BASE64.decode(SECRET_KEY);
		return Keys.hmacShaKeyFor(keyBytes);
	}
	
	//Generating Token
	public String createToken(String emailId) {
		String token= Jwts
				.builder()
				.subject(emailId) // unique user id
				.issuedAt(new Date(System.currentTimeMillis())) //setting token creation time
				.expiration(new Date(System.currentTimeMillis() + TOKEN_EXPIRY_DURATION)) //setting token expiry time
				.signWith(getSecretKey())
				.compact();
		return token;
	}
	
	//Extracting userId from the token when we received it with request
	public String getUserIdFromToken(String token) {
		String userId=Jwts
				.parser()
				.verifyWith(getSecretKey())
				.build()
				.parseSignedClaims(token)
				.getPayload()
				.getSubject();
		return userId;
	}
	
	//Extracting Expiry from the token when we received it with request
	private Boolean getExpiryFromToken(String token) {
		Date expiry=Jwts
				.parser()
				.verifyWith(getSecretKey())
				.build()
				.parseSignedClaims(token)
				.getPayload()
				.getExpiration();
		System.out.println("Token Expirt Time:"+expiry);
		return expiry.after(new Date());
	}
	
	public Boolean isTokenValid(String token, String userId) {
		 return userId.equalsIgnoreCase(getUserIdFromToken(token)) && getExpiryFromToken(token);
	}
}
