package com.app.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.app.entity.Specialization;

public class TrainerDetailDTO {
	

	private double salary;
	private  boolean status;
	private  int experience;
	@Enumerated(EnumType.STRING) 
	private Specialization specialization;
	
	private String pic;

}
