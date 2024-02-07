//package com.app.security;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//public class SecurityConfig {
//	//dep : pwd encoder
//	@Autowired
//	private PasswordEncoder enc;
//	@Bean
//	public SecurityFilterChain authorizeRequests(HttpSecurity http) throws Exception
//	{
//		http.authorizeRequests()
//		.antMatchers("/member/*").permitAll()
//		.antMatchers("/products/purchase").hasRole("CUSTOMER")
//		.antMatchers("/products/add").hasRole("ADMIN")
//		.anyRequest().authenticated()
//		.and()
//		.httpBasic();
//		return http.build();
//	}
//}