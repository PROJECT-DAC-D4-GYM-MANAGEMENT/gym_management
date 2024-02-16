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
@Table(name="workout_exercise")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutExercise 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long workout_exercise_id;	
   private String workout_name;
   private String description;

}
