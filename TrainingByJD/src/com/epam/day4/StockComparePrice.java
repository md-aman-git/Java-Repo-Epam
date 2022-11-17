package com.epam.day4;

import java.util.Comparator;

public class StockComparePrice implements Comparator<Stock> {

	@Override
	public int compare(Stock o1, Stock o2) {
		if (o1.stockPrice > o2.stockPrice)
			return 1;
		else if (o1.stockPrice < o2.stockPrice)
			return -1;
		return 0;

	}

}