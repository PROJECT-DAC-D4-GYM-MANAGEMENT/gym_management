package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Trainee;
import com.app.entity.TraineeDetail;

public interface TraineeDao extends JpaRepository<TraineeDetail, Long> {

	Trainee findTraineeById(Long tId);

}
