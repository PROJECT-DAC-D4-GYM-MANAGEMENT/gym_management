package com.app.service;

import java.util.List;

import com.app.dto.MembershipBaseDTO;
import com.app.dto.OrderBaseDTO;
import com.app.dto.ProductOrderDTO;

public interface OrderService {

	List<OrderBaseDTO> getAllOrders();

	OrderBaseDTO getOrderDetailsById(Long mId);

	String deleteOrderById(Long mid);

	void saveOrder(ProductOrderDTO pod);

}
