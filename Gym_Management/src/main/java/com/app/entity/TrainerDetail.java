package com.app.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TrainerDetail extends BaseEntity{
  
	private double salary;
	private  boolean status;
	private  int experience;
	@Enumerated(EnumType.STRING) 
	private Specialization specialization;
	@Column(length=500)
	private String pic;
	
	@OneToOne( fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "user_id" ,nullable = false)
    private UserEntity user;

    	
	
}
//@ManyToMany 
//@JoinTable(name="trainer_slot",
//joinColumns = @JoinColumn(name="trainer_id"),
//inverseJoinColumns = @JoinColumn(name="slot_id")
//)
//private Set<Slot> slot=new HashSet<>();
//@Enumerated(EnumType.STRING) 