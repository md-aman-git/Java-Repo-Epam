package com.epam.order.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVO {
	int id;
	String orderId;
	Double totalPrice;
	List<CartVO> itemData;
}
