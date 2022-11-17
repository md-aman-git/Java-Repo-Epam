package com.epam.orders.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.epam.orders.vo.ProductVO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private Order order;
	
	private int product_id;
	
	private double price;
	
	private String brand;
	
	private String model;
	
	private int quantity;
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", order=" + order + ", product_id=" + product_id + ","
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
}
