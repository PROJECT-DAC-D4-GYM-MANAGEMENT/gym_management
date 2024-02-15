package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.PlanDao;
import com.app.entity.Plan;

@Transactional
@Service
public class PlanServiceImpl implements PlanService{
     
	@Autowired
	private PlanDao plan;
	 
	
	@Override
	public List<Plan> getAllPlan() {
		
		return plan.findAll();
	}
	
	

}
