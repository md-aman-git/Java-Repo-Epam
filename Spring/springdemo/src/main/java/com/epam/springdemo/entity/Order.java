package com.epam.springdemo.entity;

public class Order {
	private int orderId;
	private Customer customer;
	public Order() {
	}
	public Order(int orderId, Customer customer) {
		this.orderId = orderId;
		this.customer = customer;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
