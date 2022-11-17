package com.epam.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.epam.feign.vo.OrderVO;

@FeignClient(name = "ORDER-SERVICE")
public interface OrderConsumer {
	@GetMapping("/orders/{id}")
	public OrderVO getOrderbyId(@PathVariable int id);
}