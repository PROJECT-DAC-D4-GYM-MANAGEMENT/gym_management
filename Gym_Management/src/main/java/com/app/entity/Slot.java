package com.app.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

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
public class Slot extends BaseEntity {
	    
	
	@Column(unique = true,nullable = false,length=50)
	private String name;
	@Column(nullable = false)
	    private int total;
	@Column(nullable = false)
	    private int current;
	    @Column(unique = true,nullable = false,length=50)
	    private String strat;
	    @Column(unique = true,nullable = false,length=50)
	    private String end;

}

//@ManyToMany(mappedBy = "slot")
//private Set<TrainerDetail> trainer = new HashSet<>();