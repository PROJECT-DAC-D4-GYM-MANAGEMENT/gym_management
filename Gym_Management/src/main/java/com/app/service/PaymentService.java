package com.app.service;

import java.util.List;

import com.app.entity.Payment;

public interface PaymentService {

	List<Payment> getAllPayment();

	Payment getpaymentDetailsById(Long payId);

}
