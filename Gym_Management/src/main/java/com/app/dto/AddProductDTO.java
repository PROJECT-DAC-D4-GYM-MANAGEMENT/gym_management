package com.app.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AddProductDTO {
	
	
	private String name;
	private double price;
	//private int stock;
	private String supplier;
	private String category;
	
	
	private String image1;
	private String image2;
	private String image3;

	private String description1;
	private String description2;
	private String description3;

}
