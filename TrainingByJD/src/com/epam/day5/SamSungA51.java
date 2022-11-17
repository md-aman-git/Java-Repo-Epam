package com.epam.day5;

@SmartPhone(screen = "led")
public class SamSungA51 {

	String modelName, os;
	double price;
	double screenSize;

	public SamSungA51(String modelName, String os, double price, double screenSize) {
		super();
		this.modelName = modelName;
		this.price = price;
		this.screenSize = screenSize;
		this.os = os;
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

	
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "SamSungA51 [modelName=" + modelName + ", price=" + price + ", screenSize=" + screenSize + "]";
	}

}
