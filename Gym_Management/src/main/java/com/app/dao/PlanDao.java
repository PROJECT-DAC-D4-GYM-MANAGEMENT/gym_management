package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Plan;
import com.app.entity.Products;

public interface PlanDao extends JpaRepository<Plan, Long> {

	
}
