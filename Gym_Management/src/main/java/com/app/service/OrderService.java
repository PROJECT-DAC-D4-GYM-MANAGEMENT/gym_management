package com.app.service;

import java.util.List;

import com.app.dto.MembershipBaseDTO;
import com.app.dto.OrderBaseDTO;

public interface OrderService {

	List<OrderBaseDTO> getAllOrders();

	OrderBaseDTO getOrderDetailsById(Long mId);

	String deleteOrderById(Long mid);

}
