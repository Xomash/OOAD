
package com.ooad.dao;

import com.ooad.entities.OrderEntity;

public interface OrderDao {

	Long createOrder(OrderEntity order);
	
	Long updateOrder(OrderEntity order);
	
	Long deleteOrder(long id);
}
