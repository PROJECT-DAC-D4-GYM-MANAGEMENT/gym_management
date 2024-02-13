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
public class SlotDTO {
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	private String name;
	
	    private int total;
	
	    private int current;
	 
	    private String strat;
	 
	    private String end;

}
