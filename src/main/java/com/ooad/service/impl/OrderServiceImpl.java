
package com.ooad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ooad.dao.OrderDao;
import com.ooad.entities.OrderEntity;
import com.ooad.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao orderDao;

	@Override
	public void createOrder(OrderEntity order) {
		orderDao.createOrder(order);
		
	}
	
}
