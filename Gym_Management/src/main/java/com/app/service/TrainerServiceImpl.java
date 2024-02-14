package com.app.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.TrainerDao;
import com.app.entity.Trainer;

@Transactional
@Service
public class TrainerServiceImpl implements TrainerService
{
	@Autowired
	private TrainerDao trainerDao;

	@Override
	public Trainer getTrainerById(Long id) {
		
		return trainerDao.findById(id)
		.orElseThrow(()->new EntityNotFoundException("Trainer not found with id:"+id));
	}

	@Override
	public List<Trainer> getAllTrainer() {
		
		return trainerDao.findAll();
	}

}
