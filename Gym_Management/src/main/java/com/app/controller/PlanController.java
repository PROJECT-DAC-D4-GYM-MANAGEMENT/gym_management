package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Plan;
import com.app.service.PlanService;

@RestController
@RequestMapping("/plan")
@CrossOrigin
public class PlanController {
  
	
	 @Autowired
	private PlanService plan;
	
	@GetMapping("/all")
	public List<Plan> getAll(){
		  return plan.getAllPlan();
	}
}
