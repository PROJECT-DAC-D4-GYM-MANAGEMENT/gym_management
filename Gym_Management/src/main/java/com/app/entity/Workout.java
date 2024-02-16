package com.app.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="workout_plan")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Workout  extends BaseEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long workoutId;
	private String workoutName;
	private String set1;
	private String set2;
	private String set3;

}
