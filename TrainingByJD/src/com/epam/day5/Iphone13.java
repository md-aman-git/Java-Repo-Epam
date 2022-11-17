package com.epam.day5;

@SmartPhone(os = "IOS", screen = "LED")
public class Iphone13 {

	String modelName;
	double price;
	double screenSize;

	public Iphone13(String modelName, double price, double screenSize) {
		super();
		this.modelName = modelName;
		this.price = price;
		this.screenSize = screenSize;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Iphone13 [modelName=" + modelName + ", price=" + price + ", screenSize=" + screenSize + "]";
	}

}
