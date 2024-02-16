package com.app.service;

import java.util.List;

import com.app.entity.DietPlan;

public interface DietPlanService 
{
	DietPlan findById(Long planId);
    List<DietPlan>findAll();
    DietPlan save(DietPlan dp);
    DietPlan  update(DietPlan dp);
    void deleteById(Long planId);

}
