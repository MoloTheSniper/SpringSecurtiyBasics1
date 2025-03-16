package com.moloko.SpringSecurityProj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.moloko.SpringSecurityProj.model.UserPrincipal;
import com.moloko.SpringSecurityProj.model.Users;
import com.moloko.SpringSecurityProj.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService
{
	 @Autowired
	 private UserRepo repo;
	
	 @Override
	 public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	 {
		 Users user = repo.findByUsername(username);
		 
		 if(user == null)
		 {
			 System.out.println("User Not found");
			 throw new UsernameNotFoundException("user not found");
		 }
		 return new UserPrincipal(user);
	 }
}
