package com.app.entity;

import java.util.ArrayList;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;



//@Entity
@AllArgsConstructor
public class Dummy {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
 @ElementCollection
 @CollectionTable(name = "user_phone_numbers", joinColumns = @JoinColumn(name = "user_id"))
 @Column(name = "phone_number")
 private java.util.List<String> skills=new ArrayList<>();
}
