package com.app.service;

import java.util.List;

import com.app.entity.Workout;

public interface WorkoutPlanService 
{
	Workout findById(Long workoutId);
	List<Workout> findAll();
	Workout save(Workout wp);
	Workout update(Workout wp);
	void deleteById(Long workoutId);
	

}
