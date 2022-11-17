package com.epam.day4;

import java.util.ArrayList;
import java.util.Collections;
public class StockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Stock> portfolio = new ArrayList<>();

		Stock s1 = new Stock("ITC", 1100);
		Stock s2 = new Stock("REL", 900);
		Stock s3 = new Stock("HMT", 100);
		Stock s4 = new Stock("TCS", 2000);
		Stock s5 = new Stock("INFY", 3000);
		Stock s6 = new Stock("CESC", 1200);

		portfolio.add(s1);
		portfolio.add(s2);
		portfolio.add(s3);
		portfolio.add(s4);
		portfolio.add(s5);
		portfolio.add(s6);

		// StockCompare sc= new StockCompare();
		// Collections.sort(portfolio, sc);
		StockComparePrice cp = new StockComparePrice();
		Collections.sort(portfolio, cp);
		//Collections.sort(portfolio);

		System.out.println(portfolio);
	}

}