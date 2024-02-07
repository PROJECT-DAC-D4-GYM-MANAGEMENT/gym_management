package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.MemberAddDto;
import com.app.dto.MemberResDto;
import com.app.entity.Member;
import com.app.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired
   private MemberService memberService;
	@PostMapping("/add")
	public  ResponseEntity<?> addMember(@RequestBody MemberAddDto mem){
		return  ResponseEntity.ok("hello");	
	}
	
	@GetMapping
	public List<MemberResDto> listAllMembers(){
		System.out.println("in list all members");
		return memberService.getAllMembers();
	}
	
	@GetMapping("/{memberId}")
	public MemberResDto getMemberById(@PathVariable Long memberId) {
		System.out.println("in get member "+memberId);
		return memberService.getMemberById(memberId);
	}
}
