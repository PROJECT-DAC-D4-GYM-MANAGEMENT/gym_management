package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.MembershipBaseDTO;
import com.app.dto.MembershipUpdateDTO;
import com.app.dto.ProductDTO;
import com.app.entity.Membership;
import com.app.service.MembershipService;

@RestController
@RequestMapping("/membership")
@CrossOrigin
public class MembershipController {

    @Autowired
    MembershipService mshipService;

    @GetMapping
    public List<MembershipBaseDTO> listAllMemberships() {
        return mshipService.getAllMemberships();
    }
    
    @GetMapping("/{mId}")
    public MembershipBaseDTO getMembershipById(@PathVariable Long mId) {
        
        return mshipService.getMembershipDetailsById(mId);
    }
    
    @DeleteMapping("/{mid}")
    public String deleteMembershipById(@PathVariable Long mid) {
    	
    	return mshipService.deleteMembershipById(mid);
    }
    
    @PutMapping("/{mid}")
    public Membership updateMembershipDetails(@PathVariable Long mid, @RequestBody MembershipUpdateDTO updatedItem) {
    	
    	return mshipService.updateMembershipDetails(mid,updatedItem);
    }
    
   
    
    

}
