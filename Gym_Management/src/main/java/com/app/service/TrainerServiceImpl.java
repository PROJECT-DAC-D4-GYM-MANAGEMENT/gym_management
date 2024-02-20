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
import com.app.dto.ProductDTO;
import com.app.dto.TrainerDTO;
import com.app.dto.Trainer_Trainee_DTO;
import com.app.entity.Trainee;
import com.app.entity.TraineeDetail;
import com.app.entity.Trainer;
import com.app.entity.TrainerDetail;

@Transactional
@Service
public class TrainerServiceImpl implements TrainerService
{
	@Autowired
	private TrainerDao trainerDao;
	
	@Autowired
	private TraineeDao traineeDao;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public TrainerDTO addTrainer(TrainerDTO trainer) {
		
		
		return  mapper.map(trainerDao.save(mapper.map(trainer, TrainerDetail.class)),TrainerDTO.class) ;
	}

	@Override
	public List<TrainerDTO> getAllDetails() {
		List<TrainerDetail> trainerList = trainerDao.findAll();
		trainerList.forEach(t->{t.getSalary();});
		return trainerList.stream().map(t->mapper.map(t, TrainerDTO.class)).collect(Collectors.toList());
	}

	

	@Override
	public TrainerDTO getTrainerById(Long id) {
		// TODO Auto-generated method stub
		TrainerDetail trainer = trainerDao.findById(id).orElse(null);
		return mapper.map(trainer, TrainerDTO.class);
	}

	@Override
	public TrainerDTO editProfile(TrainerDTO tr) {
		
		return mapper.map(trainerDao.save(mapper.map(tr, TrainerDetail.class)),TrainerDTO.class);
	}

	@Override
	public List<Trainer_Trainee_DTO> getAllTrainerAndTrainees() {
		List<TrainerDetail> trainerList = trainerDao.findAll();
		trainerList.forEach(t->{t.getSalary();});
		return trainerList.stream().map(t->mapper.map(t, Trainer_Trainee_DTO.class)).collect(Collectors.toList());
	}


	
	

}