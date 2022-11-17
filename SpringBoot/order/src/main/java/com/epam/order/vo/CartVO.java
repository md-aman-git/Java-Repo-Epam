package com.epam.order.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartVO 
{
	int id;
	int orderId;
	ProductVO prodVO;
	int quantity;
	
}
