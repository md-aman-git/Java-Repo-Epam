package com.epam.orders.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemVO {
	private int id;
	private int order_id_int;
	private ProductVO productVO;
	private int price;
	private int quantity;
}
