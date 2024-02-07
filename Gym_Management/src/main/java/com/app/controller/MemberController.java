package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.MemberAddDto;
import com.app.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired
   private MemberService ms;
	@PostMapping("/add")
	public  ResponseEntity<?> addMember(@RequestBody MemberAddDto mem){
		return  ResponseEntity.ok("hello");	
	}
}
