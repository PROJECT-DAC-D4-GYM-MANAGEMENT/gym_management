package com.app.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.app.entity.Membership;
import com.app.entity.OrderDetails;
import com.app.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ProductOrderDTO {

	private Long userId;
	
	private HashMap<Long,Integer> prodQty;

//	private List<Long> productId;

	//private double amount;

//	private ArrayList<Integer> qty;
	
	private double amount;

	

}
