package com.app.service;

import java.util.List;

import com.app.dto.TrainerDTO;
import com.app.entity.Trainee;
import com.app.entity.Trainer;

public interface TrainerService 
{
	Object addTrainer(TrainerDTO trainer);
	
	TrainerDTO getTrainerById(Long id);
	
	List<TrainerDTO> getAllDetails();
	
	Trainer editProfile(Trainer tr);
	
	Trainee assignDietPlan(Trainee tr);
	
	Trainee assignWorkout(Trainee tr);
}
