package com.epam.orders.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductVO {
	private int id;
	private String name;
	private String brand;
	private String model;
	private String type;
	private double price;
}
