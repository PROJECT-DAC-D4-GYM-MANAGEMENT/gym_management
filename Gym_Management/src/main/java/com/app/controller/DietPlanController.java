package com.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.DietPlan;
import com.app.service.DietPlanService;
import com.app.service.TraineeService;

@RestController
@RequestMapping("/dietplans")
public class DietPlanController 
{
	@Autowired
	private TraineeService traineeService;
	
	@Autowired
	private DietPlanService dietPlanService;
	
    @GetMapping("/dietplans/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id)
    {
    	Map<String, Object> map = new HashMap<String, Object>();
    	DietPlan dietPlan = dietPlanService.findById(id);
    	map.put("status", "success");
    	map.put("data", dietPlan);
		return ResponseEntity.ok(map);
    	
    }
    
    @GetMapping("/dietPlans")
    public ResponseEntity<List<DietPlan>> findAll()
    {
    	List<DietPlan> list = dietPlanService.findAll();
    	return new ResponseEntity<>(list,HttpStatus.OK);
    }
    
    @PostMapping("/save")
    public ResponseEntity<DietPlan> save(@RequestBody DietPlan dp)
    {
    	DietPlan dietplan = dietPlanService.save(dp);
    	return ResponseEntity.ok(dietplan);
    }
    
    @PutMapping("/update/{dietplanId}")
    public ResponseEntity<?> update(@PathVariable("dietplanId") Long id,@RequestBody DietPlan dp)
    {
    	dp.setId(id);
    	DietPlan newDp = dietPlanService.update(dp);
    	return ResponseEntity.ok(newDp);
    }

    @DeleteMapping("/delete/{dietplanId}")
    public void deleteById(@PathVariable("dietplanId") Long id)
    {
    	dietPlanService.deleteById(id);
    }
}
