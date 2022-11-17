package com.epam.designpattern.decorator;

public class VegCanteen implements Canteen {

	@Override
	public void prepareFood() {
		// TODO Auto-generated method stub
		System.out.println("Preparing veg food......");
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return 40.0;
	}

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Adding vegCanteen employee...");
	}

}
