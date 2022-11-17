package com.epam.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.order.entity.Order;

//import com.epam.order.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>
{
	Order findById(int id);
}
