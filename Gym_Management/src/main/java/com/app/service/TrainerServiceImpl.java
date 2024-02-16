package com.app.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.app.dao.TraineeDao;
import com.app.dao.TrainerDao;
import com.app.dao.TrainerDao1;
import com.app.dto.TrainerDTO;
import com.app.entity.Trainee;
import com.app.entity.Trainer;

@Transactional
@Service
public class TrainerServiceImpl implements TrainerService
{
	@Autowired
	private TrainerDao1 trainerDao;
	
	@Autowired
	private TraineeDao traineeDao;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public Object addTrainer(TrainerDTO trainer) {
		// TODO Auto-generated method stub
		trainerDao.save(mapper.map(trainer, Trainer.class));
		return "successfull";
	}

	@Override
	public List<TrainerDTO> getAllDetails() {
		// TODO Auto-generated method stub
		return trainerDao.findAll().stream().map(trainer -> mapper.map(trainer, TrainerDTO.class)).collect(Collectors.toList());
	}

	@Override
	public Trainer editProfile(Trainer tr) {
		// TODO Auto-generated method stub
		return trainerDao.save(tr);
	}

	@Override
	public TrainerDTO getTrainerById(Long id) {
		// TODO Auto-generated method stub
		Optional<Trainer> trainer = trainerDao.findById(id);
		return mapper.map(trainer, TrainerDTO.class);
	}

	@Override
	public Trainee assignDietPlan(Trainee tr) {
		Trainee trainee = traineeDao.save(tr);
 		return trainee;
	}

	@Override
	public Trainee assignWorkout(Trainee tr) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
