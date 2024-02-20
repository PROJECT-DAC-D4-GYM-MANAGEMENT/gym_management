package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class OrderDetails extends BaseEntity{
  
	@OneToOne( fetch = FetchType.LAZY)
	@JoinColumn(name="product_id")
	private Products product;
	
	@Column(nullable = false)
	private int quantity;
	
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name="order_id")
	private Orders order;
  
}
