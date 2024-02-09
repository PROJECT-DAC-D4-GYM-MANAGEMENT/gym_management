package com.app.security;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.entity.UserEntity;


@Service
@Transactional
public class CustomUserDetailsServiceImpl implements UserDetailsService {
    
	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user= userDao.findByEmail(username).orElseThrow(()-> new UsernameNotFoundException("invalid email"));
		return new CustomUserDetails(user); 
	}

}
