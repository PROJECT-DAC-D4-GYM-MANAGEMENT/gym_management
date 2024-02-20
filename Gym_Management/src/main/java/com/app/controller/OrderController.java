package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.OrderDao;
import com.app.dao.ProductDao;
import com.app.dao.UserDao;
import com.app.dto.MembershipBaseDTO;
import com.app.dto.MembershipUpdateDTO;
import com.app.dto.OrderBaseDTO;
import com.app.dto.ProductOrderDTO;
import com.app.entity.Membership;
import com.app.entity.Products;
import com.app.entity.UserEntity;
import com.app.service.MembershipService;
import com.app.service.OrderService;

@RestController
@RequestMapping("/orders")
@CrossOrigin
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
    public String deleteOrderById(@PathVariable Long mid) {
    	
    	return orderService.deleteOrderById(mid);
    }
    
    @PostMapping("/save")
    public String saveOrder(@RequestBody ProductOrderDTO pod) {
    	orderService.saveOrder(pod);
		return "order placed successfully" ;
    	
    }
    
   

}
