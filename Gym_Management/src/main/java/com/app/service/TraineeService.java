package com.app.service;

import java.util.List;

import com.app.dto.TraineeDTO;

public interface TraineeService {

	Object addTrainee(TraineeDTO prod);

	List<TraineeDTO> getAllTrainees();

	TraineeDTO getprodDetailsById(Long prodId);

}
