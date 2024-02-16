package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Feedback extends BaseEntity {
	
	@JoinColumn(name="user_id",nullable=false)
	private int userID;
	@JoinColumn(name="trainer_id",nullable=false)
	private int trainerID;
	@Column(length = 200)
	private String feedbackText;
	private double rating;

}
