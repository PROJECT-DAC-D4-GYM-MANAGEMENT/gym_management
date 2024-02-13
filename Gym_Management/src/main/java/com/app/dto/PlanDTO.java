package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class PlanDTO {
	@JsonProperty(access = Access.READ_ONLY)
	    private Long id;
	    private String name;
	 

	
	    private int durationMonths;

	
	    private double price;

}
