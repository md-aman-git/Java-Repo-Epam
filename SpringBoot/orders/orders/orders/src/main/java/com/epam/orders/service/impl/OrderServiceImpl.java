package com.epam.orders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.orders.entity.Item;
import com.epam.orders.entity.Order;
import com.epam.orders.repo.ItemsRepo;
import com.epam.orders.repo.OrderRepo;
import com.epam.orders.service.OrderService;
import com.epam.orders.vo.OrderVO;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepo orderRepo;

	@Autowired
	ItemsRepo itemRepo;
	@Override
	public void updateOrder(Order order) {
		List<Item> orders = order.getItems();
		order.setTotal_price(0);
		for (Item i : orders) {
			double price = order.getTotal_price() + (i.getPrice() * i.getQuantity());
			order.setTotal_price(price);
			i.setOrder(order);
			itemRepo.save(i);
		}
		
		order.setItems(orders);
		orderRepo.save(order);

	}

	@Override
	public void deleteOrderById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveOrder(OrderVO orderVO) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setOrder_id(orderVO.getOrder_id());
		order.setTotal_price(orderVO.getTotal_price());
		orderRepo.save(order);
	}

	@Override
	public Order findById(int id) {
		// TODO Auto-generated method stub
		Order order = orderRepo.findById(id);
		OrderVO orderVO = new OrderVO();
		orderVO.setOrder_id(order.getOrder_id());
		orderVO.setTotal_price(order.getTotal_price());
		orderVO.setId(order.getId());
		return order;
	}

	@Override
	public List<Order> findAllOrders() {

		return orderRepo.findAll();
	}

}
