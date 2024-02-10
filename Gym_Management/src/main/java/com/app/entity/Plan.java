package com.app.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Plan extends BaseEntity {
	
	@Column(length = 200)
	private String planName;
	private double price;
	@Column(length = 20)
	private String description;
	@OneToMany(mappedBy="plan")
	private List<Trainee> trainees=new ArrayList<>();

}
