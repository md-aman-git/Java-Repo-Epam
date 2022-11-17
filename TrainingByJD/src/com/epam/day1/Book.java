package com.epam.day1;

public class Book {
	private int pages;
	private final int price = 3;
	private String name;
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return pages * price;
	}
	
}
