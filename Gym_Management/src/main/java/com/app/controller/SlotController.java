package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.SlotTrainerDto;
import com.app.service.SlotService;

@RestController
@RequestMapping("/slot")
@CrossOrigin
public class SlotController {
	@Autowired
  private SlotService slot;
	 
	
	@GetMapping("/trainer")
	private List<SlotTrainerDto>getSlotTrainer() {
		
		return slot.getSlotTrainer();
	}
}
