package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserDTO;
import com.app.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
   private UserService userService;
	
	@PostMapping("/signup")
	public  ResponseEntity<?> addMember(@RequestBody UserDTO user){
		System.out.println(user);
		return  ResponseEntity.ok(userService.addMember(user));	
	}
	
	@GetMapping
	public List<UserDTO> listAllUsers() {
		System.out.println("in list all  depts");
		return userService.getAllUsers();
	}
	
	@GetMapping("/{userId}")
	public UserDTO getUserDetails(@PathVariable Long userId)
	{
		System.out.println("in get dept n emps "+userId);
		return userService.getUserDetailsById(userId);
	}
	
}
