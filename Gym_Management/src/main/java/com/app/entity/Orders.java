package com.app.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.internal.util.privilegedactions.NewInstance;

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
public class Orders extends BaseEntity {
	
	@OneToOne( fetch = FetchType.LAZY)
   @JoinColumn(name = "user_id")
	private UserEntity user;
	
 @OneToOne( fetch = FetchType.LAZY)
 @JoinColumn(name = "member_id",nullable = true)
  private Membership membership;
 	
  @Column(name = "order_date")
  private LocalDate date;
 
  private double amount;
  
  private String type;
  
  @OneToMany(mappedBy = "order")
  private List<OrderItem> item=new ArrayList<OrderItem>();
  
  
  
  
  
}

