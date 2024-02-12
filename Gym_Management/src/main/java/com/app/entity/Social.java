package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Social  extends BaseEntity{
	
	   @Column(length=100)
	    private String facebook;

	   @Column(length=100)
	    private String twitter;

	   @Column(length=100)
	    private String linkedin;

	   @Column(length=100)
	    private String instagram;
	    
	   
	   @OneToOne( fetch = FetchType.LAZY)
	    @MapsId
	    @JoinColumn(name="user_id" ,nullable =  false)
	    private UserEntity user;
	    

	   
}
