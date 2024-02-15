package com.app.controller;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.SigninRequest;
import com.app.dto.SigninResponse;
import com.app.dto.SignupReq;
import com.app.entity.UserEntity;
import com.app.security.CustomUserDetails;
import com.app.security.JwtUtils;
import com.app.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	
	@Autowired
	private JwtUtils utils;
	@Autowired
    private UserService us;
	@Autowired
	private AuthenticationManager mgr;
	
	
	@PostMapping("/signup")
	public  ResponseEntity<?> addMember(@RequestBody SignupReq user){
		System.out.println(user);
		return  ResponseEntity.ok(us.addMember(user));	
	}
	

	@PostMapping("/signin")
	public  ResponseEntity<?> signin(@RequestBody SigninRequest req){
		
	Authentication verifiedAuth=mgr.authenticate(new UsernamePasswordAuthenticationToken(req.getEmail(), 
			req.getPassword()));
	CustomUserDetails userPrincipal = (CustomUserDetails) verifiedAuth.getPrincipal();
	UserEntity  user=userPrincipal.getUser();
	SigninResponse res=new SigninResponse(utils.generateJwtToken(verifiedAuth),user.getFirst(),
			user.getLast(),user.getEmail(),user.getPhone(),user.getRole(),user.getId());
	return ResponseEntity
			.ok(res);
	}
	
	@GetMapping("/deatils/{id}")
	public  ResponseEntity<?> get( @PathVariable Long id){

		return  ResponseEntity.ok(us.getUserById(id));	
	}

	
}
