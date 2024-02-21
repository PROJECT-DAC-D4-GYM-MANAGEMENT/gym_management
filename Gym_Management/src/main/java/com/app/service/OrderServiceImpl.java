package com.app.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.OrderDao;
import com.app.dao.ProductDao;
import com.app.dao.UserDao;
import com.app.dto.OrderBaseDTO;
import com.app.dto.ProductDTO;
import com.app.dto.ProductOrderDTO;
import com.app.entity.OrderDetails;
import com.app.entity.Orders;
import com.app.entity.Products;
import com.app.entity.UserEntity;

@Transactional
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderDao orderDao;
	@Autowired
    private ModelMapper mapper;
	@Autowired
    UserDao userDao;
	@Autowired
    ProductDao prodDao;

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

	@Override
	public void saveOrder(ProductOrderDTO pod) {
		Orders order = new Orders();
		order.setDate(LocalDate.now());
		order.setAmount(pod.getAmount());
		order.setMembership(null);
		order.setType("Product");
		UserEntity user = userDao.findById(pod.getUserId()).orElse(null);
		order.setUser(user);
		List<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();
		for(Map.Entry<Long, Integer> entry : pod.getProdQty().entrySet()) {
			Long prodId = entry.getKey();
			Integer qty = entry.getValue();
			
			Products p = prodDao.findById(prodId).orElse(null);
			p.setStock(p.getStock()-qty);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setProduct(p);
			orderDetails.setQuantity(qty);
			orderDetails.setOrder(order);
			orderDetailsList.add(orderDetails);
			prodDao.save(p);
			
		}
		order.setOrderDetailsList(orderDetailsList);
		orderDao.save(order);
		
		updateOrderAmount(order.getId());
		
		
	}

	private void updateOrderAmount(Long id) {
		Orders order = orderDao.findById(id).orElse(null);
		double totalAmount =0;
		for(OrderDetails od:order.getOrderDetailsList()) {
			totalAmount += od.getProduct().getPrice() * od.getQuantity();
		}
		order.setAmount(totalAmount);
		orderDao.save(order);
		
	}

}
