package com.moloko.SpringSecurityProj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import com.moloko.SpringSecurityProj.model.Users;


@Repository
public interface UserRepo extends JpaRepository<Users, Integer>
{			
	Users findByUsername(String username);
}
