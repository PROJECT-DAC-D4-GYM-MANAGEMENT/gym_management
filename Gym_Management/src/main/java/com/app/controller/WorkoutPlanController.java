package com.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Workout;
import com.app.service.WorkoutPlanService;

@RestController
@RequestMapping("/workoutPlans")
@CrossOrigin
public class WorkoutPlanController 
{
	@Autowired
	private WorkoutPlanService workoutService;
	
	
	@GetMapping("/workout/{workoutId}")
	public ResponseEntity<?> findById(@PathVariable("workoutId") Long id)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		Workout workout = workoutService.findById(id);
		map.put("status", "success");
		map.put("data", workout);
		return ResponseEntity.ok(map);
	}
	
	@GetMapping("/workouts")
	public ResponseEntity<List<Workout>> findAll()
	{
		List<Workout> list = workoutService.findAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Workout> save(@RequestBody Workout workout)
	{
		Workout workoutPlan = workoutService.save(workout);
		return ResponseEntity.ok(workoutPlan);
	}
	
	@PutMapping("/update/{workoutid}")
	public ResponseEntity<Workout> update(@PathVariable("workoutid") Long id,@RequestBody Workout workout)
	{
		workout.setWorkoutId(id);
		Workout workoutplan = workoutService.update(workout);
		return ResponseEntity.ok(workoutplan);
	}
	
	@DeleteMapping("/delete/{workoutid}")
	public void deleteById(@PathVariable("workoutid") Long id)
	{
		workoutService.deleteById(id);
	}

}
