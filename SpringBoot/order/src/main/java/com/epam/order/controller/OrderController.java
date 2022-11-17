package com.epam.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epam.order.service.OrderService;
import com.epam.order.vo.OrderVO;

@RestController
public class OrderController 
{
	@Autowired
	OrderService orderService;
	
	@GetMapping("/orders")
	public ResponseEntity<List<OrderVO>> getOrderList()
	{
		List<OrderVO> l = orderService.getOrders();
		return new ResponseEntity<>(l,HttpStatus.OK);
	}
	
	@PostMapping("/orders")
	public ResponseEntity<String> placeOrder(@RequestBody OrderVO ord)
	{
		System.out.println(ord.getOrderId());
		orderService.save(ord);
		return new ResponseEntity<>("Created successfully",HttpStatus.CREATED);
	}
	
	@GetMapping("/orders/{id}")
	public ResponseEntity<OrderVO> getOrder(@PathVariable int id)
	{
		OrderVO orderVO = orderService.getOrder(id);
		return new ResponseEntity<>(orderVO,HttpStatus.OK);
	}
	
	@DeleteMapping("/orders/{id}")
	public ResponseEntity<String> deleteOrder(@PathVariable int id)
	{
		orderService.delete(id);
		return new ResponseEntity<>("Deleted successfully",HttpStatus.CREATED);
	}
	
	@PutMapping("/orders")
	public ResponseEntity<String> update(@RequestBody OrderVO orderVO)
	{
		orderService.update(orderVO);
		return null;
	}
	
}
