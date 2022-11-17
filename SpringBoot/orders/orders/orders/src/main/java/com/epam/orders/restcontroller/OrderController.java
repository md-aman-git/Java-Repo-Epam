package com.epam.orders.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.epam.orders.entity.Item;
import com.epam.orders.entity.Order;
import com.epam.orders.service.OrderService;
import com.epam.orders.service.impl.ItemServiceImpl;
import com.epam.orders.vo.OrderVO;
import com.epam.orders.vo.ProductVO;

@RestController
@CrossOrigin("*")
public class OrderController {
	@Autowired
	OrderService orderService;

	@Autowired
	ItemServiceImpl itemServiceImpl;
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getOrders() {
		List<Order> orders = orderService.findAllOrders();
		return new ResponseEntity<>(orders, HttpStatus.OK);
	}

	@GetMapping("/orders/{id}")
	public ResponseEntity<Order> getOrders(@PathVariable int id) {
		System.out.println("Hello product with id : " + id);
		Order order = orderService.findById(id);
		return new ResponseEntity<>(order, HttpStatus.OK);
	}

	@PostMapping("/orders")
	public ResponseEntity<String> saveOrder(@RequestBody OrderVO orderVO) {
		orderService.saveOrder(orderVO);
		return new ResponseEntity<>("Saved Order!", HttpStatus.CREATED);
	}

	@DeleteMapping("/orders/{id}")
	public ResponseEntity<String> deleteOrder(@PathVariable int id) {
		orderService.deleteOrderById(id);
		System.out.println("Delete ID : " + id);
		return new ResponseEntity<>("Deleted : " + id, HttpStatus.OK);
	}

	@PutMapping("/orders")
	public ResponseEntity<String> updateOrder(@RequestBody Order order) {
		orderService.updateOrder(order);
		return new ResponseEntity<>("Updated : " + order.getId(), HttpStatus.OK);
	}

	@GetMapping("/findProduct/{id}")
	public String findProduct(@PathVariable int id) {
		RestTemplate restTemplate = new RestTemplate();
		String REST_SERVICE_URI = "http://PRODUCT-SERVICE/products/" + id;
		ProductVO productVO = restTemplate.getForObject(REST_SERVICE_URI, ProductVO.class);

		return productVO.toString();
	}

	@PostMapping("/addItem/{id}/{order_id}")
	public String addItem(@RequestBody Item i, @PathVariable int id, @PathVariable int order_id) {
		//RestTemplate restTemplate = new RestTemplate();
		//String REST_SERVICE_URI = "http://localhost:9001/products/" + id;
		String REST_SERVICE_URI = "http://PRODUCT-SERVICE/products/" + id;
		ProductVO productVO = restTemplate.getForObject(REST_SERVICE_URI, ProductVO.class);
		Order o = orderService.findById(order_id);
		i = itemServiceImpl.saveItem(i,productVO,o);
		double price = o.getTotal_price() + (i.getPrice()*i.getQuantity());
		o.setTotal_price(price);
		orderService.updateOrder(o);
		return null;
	}
}
