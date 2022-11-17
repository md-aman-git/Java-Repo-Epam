package com.epam.day4;

public class Stock implements Comparable<Stock> {

	String name;
	double stockPrice;

	public Stock(String name, double stockPrice) {
		super();
		this.name = name;
		this.stockPrice = stockPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", stockPrice=" + stockPrice + "]\n";
	}

	@Override
	public int compareTo(Stock o) {
		// TODO Auto-generated method stub
		if (this.stockPrice > o.stockPrice)
			return 1;
		else if (this.stockPrice < o.stockPrice)
			return -1;
		return 0;
	}

}