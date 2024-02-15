package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.dto.MembershipBaseDTO;
import com.app.dto.MembershipUpdateDTO;
import com.app.dto.OrderBaseDTO;
import com.app.entity.Membership;
import com.app.service.MembershipService;
import com.app.service.OrderService;

public class OrderController {
	
	@Autowired
    OrderService orderService;

    @GetMapping
    public List<OrderBaseDTO> listAllOrders() {
        return orderService.getAllOrders();
    }
    
    @GetMapping("/{oId}")
    public OrderBaseDTO getOrderById(@PathVariable Long mId) {
        
        return orderService.getOrderDetailsById(mId);
    }
    
    @DeleteMapping("/{oid}")
    public String deleteMembershipById(@PathVariable Long mid) {
    	
    	return orderService.deleteOrderById(mid);
    }
    
   

}
