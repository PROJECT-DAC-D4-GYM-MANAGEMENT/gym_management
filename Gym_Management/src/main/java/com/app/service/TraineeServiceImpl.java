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
import com.app.entity.Trainee;
@Transactional
@Service
public class TraineeServiceImpl implements TraineeService{
	
	@Autowired
	TraineeDao traineeDao;
	@Autowired
    private ModelMapper mapper;
	

	@Override
	public Object addTrainee(TraineeDTO tr) {
		System.out.println(tr);
		traineeDao.save(mapper.map(tr, Trainee.class));
		return "succesful";
	}

	@Override
	public List<TraineeDTO> getAllTrainees() {
		// TODO Auto-generated method stub
		return traineeDao.findAll().stream().map(tr->mapper.map(tr, TraineeDTO.class)).collect(Collectors.toList());
	}

	@Override
	public TraineeDTO getprodDetailsById(Long tId) {
		Trainee tr = traineeDao.findTraineeById(tId);
		return mapper.map(tr, TraineeDTO.class);
	}

	@Override
	public Trainee findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Trainee> trainee = traineeDao.findById(id);
		return mapper.map(trainee, Trainee.class);
	}

	@Override
	public Trainee save(Trainee tr) {
		// TODO Auto-generated method stub
		return traineeDao.save(tr);
	}
	
	

}
