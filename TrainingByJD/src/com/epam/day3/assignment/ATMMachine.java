package com.epam.day3.assignment;

import java.util.ArrayList;

public class ATMMachine {
	public int getCustomer(ArrayList<Customer> customers, String account) {
		for(int i = 0; i < customers.size(); i++) {
			if(customers.get(i).getAccountNumber().equals(account)) return i;
		}
		return -1;
	}
	boolean isValidAmount(String amount) {
		for(char c : amount.toCharArray()) {
			if(c < '0' || c > '9') return false;
		}
		return true;
	}
	public int withdraw(Customer customer, String account, String amount) {
		if(customer == null) return -1;
		return customer.getBalance() - Integer.parseInt(amount);
	}
	public int deposite(Customer customer, String account, String amount) {
		if(customer == null) return -1;
		return customer.getBalance() + Integer.parseInt(amount);
	}
	public void showBalance(Customer customer) {
		System.out.println(customer.toString());
	}
}
