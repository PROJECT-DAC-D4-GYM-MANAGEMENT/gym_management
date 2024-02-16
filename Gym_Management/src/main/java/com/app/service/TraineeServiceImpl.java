package com.app.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.TraineeDao;
import com.app.dto.ProductDTO;
import com.app.dto.TraineeDTO;
import com.app.entity.Products;
//import com.app.entity.Trainee;
import com.app.entity.TraineeDetail;
@Transactional
@Service
public class TraineeServiceImpl implements TraineeService{
	
	@Autowired
	TraineeDao traineeDao;
	@Autowired
    private ModelMapper mapper;
	

	

	@Override
	public List<TraineeDTO> getAllTrainees() {
		// TODO Auto-generated method stub
		return traineeDao.findAll().stream().map(tr->mapper.map(tr, TraineeDTO.class)).collect(Collectors.toList());
	}

	
	@Override
	public TraineeDTO findById(Long id) {
		// TODO Auto-generated method stub
		TraineeDetail trainee = traineeDao.findById(id).orElse(null);
		return mapper.map(trainee, TraineeDTO.class);
	}

	
	
	

}
