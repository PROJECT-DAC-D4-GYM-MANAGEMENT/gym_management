package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TraineeDTO {
	
	@JsonProperty(access = Access.READ_ONLY) 
    private Long id; 
	@JsonProperty(value="fname")
	private String firstName;
	@JsonProperty(value="lname")
	private String lastName;
	@JsonProperty(value="dob")
	private LocalDate dob;
	@JsonProperty(value="gender")
	private String gender;
	@JsonProperty(value="phone")
	private int contactNumber;
	@JsonProperty(value="email")
	private String Email;
	@JsonProperty(value="password",access = Access.WRITE_ONLY)
	private String password;


}