package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Trainer;
import com.app.service.TrainerServiceImpl;

@RestController
@RequestMapping("/trainers")
public class TrainerController 
{
	@Autowired
	private TrainerServiceImpl trainerservice;
	
	@GetMapping
	public List<Trainer> getAllTrainers()
	{
		return trainerservice.getAllTrainer();	
	}
	
	@GetMapping("/{id}")
	public Trainer getTrainerById(@PathVariable Long id)
	{
		return trainerservice.getTrainerById(id);
	}
	

}
