package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.DietPlan;

public interface DietPlanDao extends JpaRepository<DietPlan, Long>{

}
