package com.epam.mockitodemo;

public class CalculatorImpl implements CalculatorService {

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i + j;
	}

}
