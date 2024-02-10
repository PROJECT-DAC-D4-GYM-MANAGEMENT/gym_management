package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.TraineeDTO;
import com.app.service.TraineeService;

@RestController
@RequestMapping("/trainee")
@CrossOrigin(origins = "http://localhost:3000")
public class TraineeController {
	
	@Autowired
	TraineeService ts;
	
	  @PostMapping("/addtrainee")
	    public ResponseEntity<?> addtrainee(@RequestBody TraineeDTO prod) {
	        System.out.println(prod);
	        return ResponseEntity.ok(ts.addTrainee(prod));
	    }

	    @GetMapping
	    public List<TraineeDTO> getAllTrainees() {
	        System.out.println("in list all  Trainees");
	        return ts.getAllTrainees();
	    }

	    @GetMapping("/{tId}")
	    public TraineeDTO getTraineeDetails(@PathVariable Long tId) {
	        System.out.println("in get dept n emps " + tId);
	        return ts.getprodDetailsById(tId);
	    }

}
