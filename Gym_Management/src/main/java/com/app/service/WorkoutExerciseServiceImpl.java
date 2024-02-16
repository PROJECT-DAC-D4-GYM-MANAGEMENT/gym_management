package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.WorkoutExerciseDao;
import com.app.entity.WorkoutExercise;

@Service
@Transactional
public class WorkoutExerciseServiceImpl implements WorkoutExerciseService
{
	@Autowired
	private WorkoutExerciseDao exerciseDao;

	@Override
	public List<WorkoutExercise> findAll() {
		return exerciseDao.findAll();
	}

	@Override
	public WorkoutExercise findById(Long workoutExerciseId) {
		// TODO Auto-generated method stub
		Optional<WorkoutExercise> exercise = exerciseDao.findById(workoutExerciseId);
		return exercise.orElse(null);
	}

	@Override
	public WorkoutExercise update(WorkoutExercise we) {
		// TODO Auto-generated method stub
		return exerciseDao.save(we);
	}

	@Override
	public void deleteById(Long exerciseId) {
		// TODO Auto-generated method stub
		exerciseDao.deleteById(exerciseId);
		
	}

	@Override
	public WorkoutExercise save(WorkoutExercise workout_exercise) {
		// TODO Auto-generated method stub
		return exerciseDao.save(workout_exercise);
	}

}
