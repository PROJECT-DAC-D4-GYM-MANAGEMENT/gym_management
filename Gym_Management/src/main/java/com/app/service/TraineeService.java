package com.app.service;

import java.util.List;

import com.app.dto.TraineeDTO;
import com.app.entity.Trainee;

public interface TraineeService {

	Object addTrainee(TraineeDTO prod);

	List<TraineeDTO> getAllTrainees();

	TraineeDTO getprodDetailsById(Long prodId);
	
	Trainee findById(Long id);
	
	Trainee save(Trainee tr);

}
