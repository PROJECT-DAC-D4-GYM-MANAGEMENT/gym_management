package com.app.security;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.app.entity.UserEntity;

public class CustomUserDetails implements UserDetails {
	
   ;	
   private UserEntity user;
   
 
	public CustomUserDetails(UserEntity user) {
	super();
	this.user = user;
}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority("ROLE_"+user.getRole()));
	}

	@Override
	public String getPassword() {
		 BCryptPasswordEncoder en =new BCryptPasswordEncoder(12,new SecureRandom());
		 
		return en.encode(user.getPassword());
	}

	@Override
	public String getUsername() {
		
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String toString() {
		return "CustomUserDetails [user=" + user + "]";
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
	

}
