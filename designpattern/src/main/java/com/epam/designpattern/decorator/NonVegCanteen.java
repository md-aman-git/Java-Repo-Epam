package com.epam.designpattern.decorator;

public class NonVegCanteen extends CanteenDecorator {

	public NonVegCanteen(Canteen canteen) {
		super(canteen);
	}
	
	public void prepareFood() {
		super.prepareFood();
		System.out.println("Non-Veg canteen foods...");
	}
	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.getFoodPrice() + 20.0;
	}

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Non-veg employee added...");
	}
	
}
