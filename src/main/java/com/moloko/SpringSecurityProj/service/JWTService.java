package com.moloko.SpringSecurityProj.service;

import org.springframework.stereotype.Service;

@Service
public class JWTService 
{

	public String generateToken() {
		
		return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyLCJleHAiOjEyMTMyNDQ0M30.0i8I6GzkZEH6sMWdaN-HG_kdflwW1OViqENn6lYaeHw";
	}

}
