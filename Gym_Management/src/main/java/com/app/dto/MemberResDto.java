package com.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MemberResDto {

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
}
