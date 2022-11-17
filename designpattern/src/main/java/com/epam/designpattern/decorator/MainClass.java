package com.epam.designpattern.decorator;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VegCanteen veg = new VegCanteen();
		veg.prepareFood();
		System.out.println("Price : " + veg.foodPrice());
		
		//same using Canteen interface
		Canteen veg1 = new VegCanteen();
		veg1.prepareFood();
		System.out.println("Price : " + veg1.foodPrice());
		
		//non-veg
		Canteen nonVeg = new NonVegCanteen(veg);
		nonVeg.prepareFood();
		System.out.println("Price : " + nonVeg.foodPrice());
		
		//chinese-food
		Canteen chinese = new ChineseCanteen(veg);
		chinese.prepareFood();
		System.out.println("Price : " + chinese.foodPrice());
	}

}
