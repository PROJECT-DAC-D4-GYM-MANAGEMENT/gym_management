package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Trainer;
import com.app.entity.TrainerDetail;

public interface TrainerDao extends JpaRepository<TrainerDetail, Long>
{
	 List<TrainerDetail> getTrainerById(Long id);

}
