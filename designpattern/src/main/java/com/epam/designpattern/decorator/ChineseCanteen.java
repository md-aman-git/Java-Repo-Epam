package com.epam.designpattern.decorator;

public class ChineseCanteen extends CanteenDecorator {

	public ChineseCanteen(Canteen canteen) {
		super(canteen);
	}
	public void prepareFood() {
		super.prepareFood();
		System.out.println("Chinese canteen foods...");
	}
	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.getFoodPrice() + 10.0;
	}
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		super.addEmployee();
		System.out.println("Chinese employee added...");
	}
}
