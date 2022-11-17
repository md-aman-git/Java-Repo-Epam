package com.epam.order.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data		
@NoArgsConstructor
@AllArgsConstructor
@Table(name="t_order")
@Entity
public class Order 
{
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private int id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column
	private String orderId;
	
	@Column
	private Double totalPrice;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="order_id")
	private List<Cart> itemData;
	
	public void addItemToTheCart(Cart c)
	{
			if(itemData == null)
			{
				itemData = new ArrayList<>();
			}
			
			itemData.add(c);
	}
	
}
