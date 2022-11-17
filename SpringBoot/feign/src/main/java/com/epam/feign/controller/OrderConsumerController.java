package com.epam.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.epam.feign.service.OrderConsumer;
import com.epam.feign.vo.OrderVO;

@RestController
public class OrderConsumerController {
	
	@Autowired
	OrderConsumer orderConsumer;
	
	@GetMapping("/orders/{id}")
	public ResponseEntity<OrderVO> getOrderById(@PathVariable int id) {
		System.out.println("Hello Order");
		return new ResponseEntity<>(orderConsumer.getOrderbyId(id), HttpStatus.OK);
	}
}
