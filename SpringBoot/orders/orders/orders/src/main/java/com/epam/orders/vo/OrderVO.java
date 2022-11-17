package com.epam.orders.vo;

import java.util.List;

import com.epam.orders.entity.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderVO {
	private int id;
	private String order_id;
	private double total_price;
	List<Item> items ;
}
