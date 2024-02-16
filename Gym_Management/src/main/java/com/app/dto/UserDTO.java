package com.app.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	
	private String first;
	
	private String last;

	private long phone;
	
	private String email;
	
	private String password;
	
	private String role="user";


}
