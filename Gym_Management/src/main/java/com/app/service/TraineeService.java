package com.app.service;

import java.util.List;

import com.app.dto.TraineeDTO;
//import com.app.entity.Trainee;

public interface TraineeService {



	List<TraineeDTO> getAllTrainees();
	TraineeDTO findById(Long id);

	
	


}
