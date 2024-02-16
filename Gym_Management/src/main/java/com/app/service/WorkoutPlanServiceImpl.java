package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.WorkoutPlanDao;
import com.app.entity.Workout;

@Service
@Transactional
public class WorkoutPlanServiceImpl implements WorkoutPlanService
{
	@Autowired
	private WorkoutPlanDao workoutDao;
	
	
	@Override
	public Workout findById(Long workoutId) {
		// TODO Auto-generated method stub
		Optional<Workout> wp = workoutDao.findById(workoutId);
		return wp.orElse(null);
	}

	@Override
	public List<Workout> findAll() {
		// TODO Auto-generated method stub
		return workoutDao.findAll();
	}

	@Override
	public Workout save(Workout wp) {
		// TODO Auto-generated method stub
		return workoutDao.save(wp);
	}

	@Override
	public Workout update(Workout wp) {
		// TODO Auto-generated method stub
		return workoutDao.save(wp);
	}

	@Override
	public void deleteById(Long workoutId) {
		// TODO Auto-generated method stub
		workoutDao.deleteById(workoutId);
		
	}

}
