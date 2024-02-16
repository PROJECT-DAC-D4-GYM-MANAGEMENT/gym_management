package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ProductDTO;
import com.app.entity.Payment;
import com.app.service.PaymentService;
import com.app.service.ProductService;

@RestController
@RequestMapping("/payment")
@CrossOrigin
public class PaymentController {
	
	  @Autowired
	    PaymentService paymentService;

	    @GetMapping
	    public List<Payment> getAllPayments() {
	        System.out.println("in list all  products");
	        return paymentService.getAllPayment();
	    }

	    @GetMapping("/{paymentId}")
	    public Payment getPaymentDetails(@PathVariable Long payId) {
	        System.out.println("in get dept n emps " + payId);
	        return paymentService.getpaymentDetailsById(payId);
	    }


}
