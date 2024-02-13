//package com.app.entity;
//
//import java.time.LocalDate;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Entity
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString(callSuper = true)
//public class Plan extends BaseEntity {
//	
//	@Column(length = 200)
//	private String planName;
//	private double price;
//	@Column(length = 20)
//	private String description;
//
//}

package com.app.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Plan extends BaseEntity {
	
	 @Column(length = 200,nullable =  false)
	    private String name;
	 

	 @Column(length = 200,nullable =  false)
	    private int durationMonths;

	 @Column(nullable =  false)
	    private double price;
	 
	 
	 
	 @ElementCollection(fetch = FetchType.EAGER)
	 @CollectionTable(name = "plan_description", joinColumns = @JoinColumn(name = "Plan_id"))
	 @Column(name = "description")
	 private List<String> dscription=new ArrayList<>();
	 
	
	 
	}


	  
	    
		
   


