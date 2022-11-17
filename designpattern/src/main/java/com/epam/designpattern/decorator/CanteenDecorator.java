package com.epam.designpattern.decorator;

public abstract class CanteenDecorator implements Canteen {
	private Canteen newCanteen;
	public CanteenDecorator(Canteen newCanteen) {
		this.newCanteen = newCanteen;
	}
	public void prepareFood() {
		newCanteen.prepareFood();
	}
	public double getFoodPrice() {
		return newCanteen.foodPrice();
	}
	public void addEmployee() {
		newCanteen.addEmployee();
	}
}
