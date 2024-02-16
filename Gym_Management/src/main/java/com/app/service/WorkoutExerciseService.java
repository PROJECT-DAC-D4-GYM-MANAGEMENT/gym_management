package com.app.service;

import java.util.List;

import com.app.entity.WorkoutExercise;

public interface WorkoutExerciseService 
{
	List<WorkoutExercise> findAll();
    WorkoutExercise findById(Long workoutExerciseId);
    WorkoutExercise update(WorkoutExercise we);
    void deleteById(Long exerciseId);
    WorkoutExercise save(WorkoutExercise workout_exercise);

}
