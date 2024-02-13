package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.app.entity.Specialization;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrainerDetailDTO {
	@JsonProperty(access = Access.READ_ONLY)
    private Long id;
	private double salary;
	private  boolean status;
	private  int experience;
	@Enumerated(EnumType.STRING) 
	private Specialization specialization;
	
	private String pic;

}
