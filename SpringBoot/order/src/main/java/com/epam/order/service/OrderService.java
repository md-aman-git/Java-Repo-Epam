package com.epam.order.service;

import java.util.List;

import com.epam.order.vo.OrderVO;

public interface OrderService {
	
	public List<OrderVO> getOrders();
	void save(OrderVO ord);
	OrderVO getOrder(int id);
	void delete(int id);
	void update(OrderVO orderVO);
}
