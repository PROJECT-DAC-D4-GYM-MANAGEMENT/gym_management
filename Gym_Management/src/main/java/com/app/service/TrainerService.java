package com.app.service;

import java.util.List;

import com.app.dto.TrainerDTO;
//import com.app.entity.Trainee;
//import com.app.entity.Trainer;
import com.app.dto.Trainer_Trainee_DTO;

public interface TrainerService 
{
	TrainerDTO addTrainer(TrainerDTO trainer);
	
	TrainerDTO getTrainerById(Long id);
	
	List<TrainerDTO> getAllDetails();
	
	TrainerDTO editProfile(TrainerDTO tr);

	List<Trainer_Trainee_DTO> getAllTrainerAndTrainees();
	
	///////////////////////////

}
