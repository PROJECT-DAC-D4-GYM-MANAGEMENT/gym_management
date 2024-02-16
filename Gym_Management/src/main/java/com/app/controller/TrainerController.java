package com.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.TrainerDTO;
import com.app.entity.DietPlan;
import com.app.entity.Trainee;
import com.app.entity.Trainer;
import com.app.entity.Workout;
import com.app.service.DietPlanService;
import com.app.service.TraineeService;
import com.app.service.TrainerService;
import com.app.service.WorkoutPlanService;

@RestController
@RequestMapping("/trainers")
public class TrainerController 
{
    @Autowired
    private TrainerService trainerService;
    
    @Autowired
    private DietPlanService dietPlanService;
    
    @Autowired
    private TraineeService traineeService;
    
    @Autowired
    private WorkoutPlanService workoutService;
    
    
    @GetMapping("/trainers/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id)
    {
    	Map<String, Object> map = new HashMap<String, Object>();
    	TrainerDTO trainer = trainerService.getTrainerById(id);
    	map.put("status", "success");
    	map.put("data", trainer);
    	return ResponseEntity.ok(map);
    }
    
    @PostMapping("/addTrainer")
    public ResponseEntity<?> save(@RequestBody TrainerDTO tr)
    {
    	Object trainer = trainerService.addTrainer(tr);
		return ResponseEntity.ok(trainer);  	
    }
    
    @GetMapping("/trainers")
    public ResponseEntity<List<TrainerDTO>> findAll()
    {
    	List<TrainerDTO> list = trainerService.getAllDetails();
    	return new ResponseEntity<>(list, HttpStatus.OK);
    }
    
    @PutMapping("/edit/{id}")
    public ResponseEntity<?> edit(@PathVariable("id") Long id, @RequestBody TrainerDTO tr)
    {
    	tr.setId(id);
    	TrainerDTO trainer = trainerService.editProfile(tr);
    	return ResponseEntity.ok(trainer);
    }
    
//    @PutMapping("/trainers/{traineeId}/assignDietplan")
//    public ResponseEntity<Trainee> assignDietPlan(@PathVariable("traineeId") Long id,@RequestBody DietPlan dp)
//    {
//    	Long dietplanId = dp.getId();
//    	DietPlan optionalDietPlan = dietPlanService.findById(dietplanId);
//    	Trainee trainee = traineeService.findById(id);
//    	trainee.setDietPlan(optionalDietPlan);
//    	Trainee tr = traineeService.save(trainee);
//    	return ResponseEntity.ok(tr);
//    }
    
//    @PutMapping("/trainers/{traineeId}/assignWorkoutPlan")
//    public ResponseEntity<Trainee> assignWorkoutPlan(@PathVariable("traineeId") Long id,@RequestBody Workout workout)
//    {
//    	Long workoutPlanId = workout.getWorkoutId();
//    	Workout optionalWorkoutPlan = workoutService.findById(workoutPlanId);
//    	Trainee trainee = traineeService.findById(id);
//    	trainee.setWorkout(optionalWorkoutPlan);
//    	Trainee tr = traineeService.save(trainee);
//    	return ResponseEntity.ok(tr);
//    }
}
