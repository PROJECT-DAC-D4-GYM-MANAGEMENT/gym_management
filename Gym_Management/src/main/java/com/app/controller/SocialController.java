package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ProductDTO;
import com.app.dto.SocialDTO;
import com.app.service.SocialService;

@RestController
@RequestMapping("/social")
@CrossOrigin
public class SocialController {
	@Autowired
	SocialService socialService;
	
	@PostMapping("/add/{id}")
	public SocialDTO addSocialDetails(@RequestBody SocialDTO social, @PathVariable Long id) {
		
		return socialService.save(social,id);
	}

}
