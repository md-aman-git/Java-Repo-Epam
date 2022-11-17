package com.epam.day4;

import java.util.Comparator;

public class StockCompare implements Comparator<Stock> {
	@Override
	public int compare(Stock o1, Stock o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
