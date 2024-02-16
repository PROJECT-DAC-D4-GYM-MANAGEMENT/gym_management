package com.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.WorkoutExercise;
import com.app.service.WorkoutExerciseService;

@RestController
@CrossOrigin
@RequestMapping("/workoutExercise")
public class WorkoutExerciseController 
{
	@Autowired(required=true)
	private WorkoutExerciseService exerciseService;
	
	@GetMapping("/allExercises")
	public ResponseEntity<List<WorkoutExercise>> findAll()
	{
		List<WorkoutExercise> list = exerciseService.findAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
    @GetMapping("/exercise/{exercise_id}")
    public ResponseEntity<?> findById(@PathVariable("exercise_id") Long id)
    {
    	Map<String, Object> map = new HashMap<String, Object>();
    	WorkoutExercise exercise = exerciseService.findById(id);
    	map.put("status", "success");
    	map.put("data", exercise);
    	
    	return ResponseEntity.ok(map);
    }
    
    @PostMapping("/exercise/save")
    public ResponseEntity<WorkoutExercise> save(@RequestBody WorkoutExercise exercise)
    {
    	WorkoutExercise exe = exerciseService.save(exercise);
    	return ResponseEntity.ok(exe);
    }

}
