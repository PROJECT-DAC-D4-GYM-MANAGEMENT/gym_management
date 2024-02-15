package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.OrderDao;
import com.app.dto.OrderBaseDTO;
import com.app.dto.ProductDTO;

public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderDao orderDao;
	@Autowired
    private ModelMapper mapper;


	@Override
	public List<OrderBaseDTO> getAllOrders() {
	
		return orderDao.findAll().stream().map(p->mapper.map(p, OrderBaseDTO.class)).collect(Collectors.toList());
	}

	@Override
	public OrderBaseDTO getOrderDetailsById(Long mId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOrderById(Long mid) {
		// TODO Auto-generated method stub
		return null;
	}

}
