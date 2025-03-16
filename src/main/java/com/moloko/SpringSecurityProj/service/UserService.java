package com.moloko.SpringSecurityProj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.moloko.SpringSecurityProj.model.Users;
import com.moloko.SpringSecurityProj.repo.UserRepo;

@Service
public class UserService 
{
	@Autowired
	private UserRepo repo;
	
	//Bcrypt object from spring security
	
	//Strength = 12
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	public Users register(Users user)
	{
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
		
	}
}
