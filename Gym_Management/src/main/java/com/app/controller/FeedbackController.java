package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Feedback;
import com.app.service.FeedbackService;



@RestController
@RequestMapping("/feedback")
@CrossOrigin
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	@GetMapping
	public List<Feedback> getAllFeedbacks(){
		return feedbackService.getAllFeedback();
	}

}
