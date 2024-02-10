package com.app.dto;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO {
	@JsonProperty(value="prod_id",access = Access.READ_ONLY)
	private Long id;
	private String prodName;
	private String description;
	private double price;
	private int stock;
	private String supplier;

}
