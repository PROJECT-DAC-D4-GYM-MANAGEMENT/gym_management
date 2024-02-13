package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.MembershipDTO;
import com.app.service.MembershipService;

@RestController
@RequestMapping("/membership")
@CrossOrigin
public class MembershipController {

    @Autowired
    MembershipService mshipservice;

    @GetMapping
    public List<MembershipDTO> listAllMemberships() {
        return mshipservice.getAllMemberships();
    }
    

}
