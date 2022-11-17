package com.epam.order.entity;



import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="t_cart")
@Entity
public class Cart
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
//	@Column(name="product_id")
	int productId;
	
	@Column
	int quantity;
	
	@Column
	int price;
}
