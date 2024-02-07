package com.app.dto;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MemberAddDto {
     
	@JsonProperty(value="fname")
	private String firstName;
	@JsonProperty(value="lname")
	private String lastName;
	@JsonProperty(value="phone")
	private int phone;
	@JsonProperty(value="email")
	private String email;
	@JsonProperty(value="password")
	private String password;
//	private String type;

}


//@Column(length = 30,name = "fname",nullable = false)
//private String firstName;
//@Column(length = 30,name = "lname",nullable = false)
//private String lastName;
//@Column(nullable = false,unique = true)
//private int phone;
//@Column(length = 30,unique=true,nullable = false)
//private String email;
//@Column(length = 25, nullable = false)
//private String password;
//@Column( nullable=false,columnDefinition = "CHAR(25) DEFAULT 'member'")
//private String type;