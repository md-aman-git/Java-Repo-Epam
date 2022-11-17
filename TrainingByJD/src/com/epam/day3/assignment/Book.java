package com.epam.day3.assignment;

import java.io.Serializable;

public class Book implements Serializable {
	private int id, price;
	private String name;
	public Book(int id, int price, String name) {
		this.id = id;
		this.price = price;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	
	
}
