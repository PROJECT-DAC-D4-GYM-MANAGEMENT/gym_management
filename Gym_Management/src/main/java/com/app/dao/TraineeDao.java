package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Trainee;

public interface TraineeDao extends JpaRepository<Trainee, Long> {

	Trainee findTraineeById(Long tId);

}
