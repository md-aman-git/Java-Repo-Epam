package com.epam.orders.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.orders.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
	public List<Order> findAll();
	public Order findById(int id);
}
