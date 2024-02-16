package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.WorkoutExercise;

public interface WorkoutExerciseDao extends JpaRepository<WorkoutExercise, Long> 
{

}
