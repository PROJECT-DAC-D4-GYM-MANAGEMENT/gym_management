package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.TrainerDetail;

public interface TrainerDao extends  JpaRepository<TrainerDetail, Long>{

}