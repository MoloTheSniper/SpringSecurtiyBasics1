package com.moloko.SpringSecurityProj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //This is a configuration class
@EnableWebSecurity //Telling Spring we dont want default settings
public class SecurityConfig 
{
	//Custom Filter chain Code
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.csrf(customizer -> customizer.disable())
			.authorizeHttpRequests(request -> request.anyRequest().authenticated()) //Know one should be able to access page without being authorized
			.formLogin(Customizer.withDefaults()) //enabling login form
			.httpBasic(Customizer.withDefaults())
			.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.build();
	}
}
