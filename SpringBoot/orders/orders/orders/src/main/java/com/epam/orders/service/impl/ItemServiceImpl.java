package com.epam.orders.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.orders.entity.Item;
import com.epam.orders.entity.Order;
import com.epam.orders.repo.ItemsRepo;
import com.epam.orders.vo.ProductVO;

@Service
public class ItemServiceImpl {

	@Autowired
	private ItemsRepo itemsRepo;
	
	
	public Item saveItem(Item  i,ProductVO productVO,Order o) {
		i.setProduct_id(productVO.getId());
		i.setPrice(productVO.getPrice());
		i.setOrder(o);
		i.setModel(productVO.getModel());
		i.setBrand(productVO.getBrand());
		return itemsRepo.save(i);
	}
}
