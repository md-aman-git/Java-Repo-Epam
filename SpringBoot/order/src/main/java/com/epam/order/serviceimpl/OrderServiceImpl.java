package com.epam.order.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.epam.order.entity.Cart;
import com.epam.order.entity.Order;
import com.epam.order.repo.CartRepo;
import com.epam.order.repo.OrderRepo;
import com.epam.order.service.OrderService;
import com.epam.order.vo.CartVO;
import com.epam.order.vo.OrderVO;
import com.epam.order.vo.ProductVO;

@Service
public class OrderServiceImpl implements OrderService {

	//private static RestTemplate r = new RestTemplate();

	@Autowired
	OrderRepo orderRepo;

	@Autowired
	CartRepo cartRepo;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public List<OrderVO> getOrders() {

		// get order details from database
		List<Order> ordList = orderRepo.findAll();

		// list to return to front end
		List<OrderVO> ordVoList = new ArrayList<OrderVO>();

		// order vo

		// loop through each order fetched from db (t_order)
		for (Order order : ordList) {
			
			OrderVO orderVO = getOrderVO(order);
			// store ordervo to the list
			ordVoList.add(orderVO);

		}

		// return the list
		return ordVoList;
	}

	@Override
	public void save(OrderVO ord) {
		double totalPrice = 0;

		Order order = new Order();

		for (CartVO c : ord.getItemData()) {
			String url = "http://PRODUCT-SERVICE/products/" + c.getProdVO().getId();
			ProductVO pvo = restTemplate.getForObject(url, ProductVO.class);

			Cart cart = new Cart();
			cart.setProductId(pvo.getId());
			cart.setPrice(pvo.getPrice());
			cart.setQuantity(c.getQuantity());

			order.addItemToTheCart(cart); // one to many mapping
			order.setOrderId(ord.getOrderId());

			cartRepo.save(cart);

			totalPrice += (pvo.getPrice() * c.getQuantity());

		}

		order.setTotalPrice(totalPrice);

		orderRepo.save(order);
	}

	@Override
	public OrderVO getOrder(int id) {
		Order order = orderRepo.findById(id);

		OrderVO orderVO = getOrderVO(order);

		return orderVO;
	}

	private OrderVO getOrderVO(Order order) {
		OrderVO orderVO = new OrderVO();
		// to store the list of items that is associated with order
		List<CartVO> cartVoList = new ArrayList<>();

		// set values to individual orderVO
		orderVO.setId(order.getId());
		orderVO.setOrderId(order.getOrderId());
		orderVO.setTotalPrice(order.getTotalPrice());

		// for each item in cart table
		for (Cart c : order.getItemData()) // t_cart
		{
			// vo to store each item
			CartVO cartVO = new CartVO();

			// get product id
			int id = c.getProductId();

			// fetch product details from product microservice
			String url = "http://PRODUCT-SERVICE/products/" + id;
			ProductVO pvo = restTemplate.getForObject(url, ProductVO.class);

			cartVO.setProdVO(pvo);
			cartVO.setId(c.getId());
			cartVO.setQuantity(c.getQuantity());

			// order id = primary key of t_cart
			cartVO.setOrderId(order.getId());

			// add each item(cartVO) to cart
			cartVoList.add(cartVO);
		}

		// add list of items (cartvolist) to the ordervo
		orderVO.setItemData(cartVoList);

		return orderVO;
	}

	@Override
	public void delete(int id) {
		Order order = orderRepo.findById(id);
		
		// load all the items(t_cart table) mapped with order
		List<Cart> carts = order.getItemData();
		
		// delete each items
		for(Cart cart : carts)
		{
			cartRepo.deleteById(cart.getId());
		}
		
		
		//delete order
		orderRepo.deleteById(id);
	}

	@Override
	public void update(OrderVO orderVO) 
	{
		
		Order order = new Order();
		double totalPrice = 0;
		
		order.setId(orderVO.getId());
		order.setOrderId(orderVO.getOrderId());

		List<Cart> cartList = new ArrayList<Cart>();
		List<CartVO> cartVOList = orderVO.getItemData();
		
		for(CartVO c : cartVOList)
		{
			
			Cart cart= cartRepo.findById(c.getId());
			System.out.println("Cart Id : "+cart.getId());
			
			String url = "http://PRODUCT-SERVICE/products/" + c.getProdVO().getId();
			ProductVO pvo = restTemplate.getForObject(url, ProductVO.class);
			
			cart.setId(c.getId());
			cart.setPrice(pvo.getPrice());
			cart.setProductId(c.getProdVO().getId());
			cart.setQuantity(c.getQuantity());
			
			cartRepo.save(cart);
			cartList.add(cart);
			totalPrice += (c.getQuantity()*cart.getPrice());
		}
		
		order.setItemData(cartList);
		order.setTotalPrice(totalPrice);
		orderRepo.save(order);
		
	}
	
	

}
