package com.app.entity;

import java.time.LocalDate;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
=======

import javax.persistence.Column;
import javax.persistence.Entity;
>>>>>>> pojo_updation
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
public class Trainer extends BaseEntity {
	@Column(length = 20)
	private String firstName;
	@Column(length = 20)
	private String lastName;
	private int contactNumber;
	@Column(length = 20,unique=true)
	private String email;
	@Column(length = 25, nullable = false)
	private String password;
	private String specialization;
	@OneToMany(mappedBy="trainer")
	private List<Trainee> trainees= new ArrayList<>();

}
