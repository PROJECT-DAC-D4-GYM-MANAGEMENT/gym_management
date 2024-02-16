package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Trainee extends BaseEntity {
	@Column(length = 20)
	private String firstName;
	@Column(length = 20)
	private String lastName;
	private LocalDate dob;
	private String gender;
	private int contactNumber;
	@Column(length = 20,unique=true)
	private String email;
	@Column(length = 25, nullable = false)
	private String password;
	@ManyToOne
	@JoinColumn(name="plan_id",nullable= false)
	private Plan plan;
	@ManyToOne
	@JoinColumn(name="trainer_id",nullable= false)
	private Trainer trainer;
	
	@ManyToOne
	@JoinColumn(name="dietPlan_id",nullable=false)
	private DietPlan dietPlan;
	
	@ManyToOne
	@JoinColumn(name="workout_id",nullable=false)
	private Workout workout;
	private LocalDate startDate;
	private LocalDate endDate;
	

}
