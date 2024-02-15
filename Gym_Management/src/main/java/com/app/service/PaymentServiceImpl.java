package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Payment;
@Transactional
@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public List<Payment> getAllPayment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getpaymentDetailsById(Long payId) {
		// TODO Auto-generated method stub
		return null;
	}

}
