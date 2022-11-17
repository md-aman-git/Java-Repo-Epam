package com.epam.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epam.order.entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {
	
	Cart findById(int id);
	
}
