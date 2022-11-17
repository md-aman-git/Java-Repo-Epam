package com.epam.orders.service;

import java.util.List;

import com.epam.orders.entity.Order;
import com.epam.orders.vo.OrderVO;

public interface OrderService {

	void updateOrder(Order order);

	void deleteOrderById(int id);

	void saveOrder(OrderVO orderVO);

	Order findById(int id);

	List<Order> findAllOrders();

}
