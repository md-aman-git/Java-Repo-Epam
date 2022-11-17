package com.epam.day3.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char input = '3';
		ATMMachine atm = new ATMMachine();
		ArrayList<Customer> customers = new ArrayList<>();
		Customer c1 = new Customer("123456789", "Aman", 10000);
		Customer c2 = new Customer("987654321", "Rahul", 10000);
		Customer c3 = new Customer("124356879", "Ilyas", 10000);
		Customer c4 = new Customer("123098567", "Shivkanya", 10000);
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		
		while(input != '0') {
			System.out.println("1. Withdrwal of money.");
			System.out.println("2. Deposite of money.");
			System.out.println("0. Exit.");
			input = sc.next().charAt(0);
			String account;
			String amount;
			switch(input) {
			case '1':
				System.out.println("Enter Customer account number : ");
				account = sc.next();
				System.out.println("Enter an amount : ");
				amount = sc.next();
				int index1 = atm.getCustomer(customers, account);
				if(index1 < 0) {
					System.out.println("Please enter a valid account number.");
					break;
				}
				if(!atm.isValidAmount(amount)) {
					System.out.println("Enter a valid amount!");
					break;
				}
				int remainingAmount = atm.withdraw(customers.get(index1), account, amount);
				if(remainingAmount >= 0) {
					customers.get(index1).setBalance(remainingAmount);
				}
				else {
					System.out.println("Insufficient balance..");
				}
				atm.showBalance(customers.get(index1));
				break;
			case '2':
				System.out.println("Enter Customer account number : ");
				account = sc.next();
				System.out.println("Enter an amount : ");
				amount = sc.next();
				int index2 = atm.getCustomer(customers, account);
				if(index2 < 0) {
					System.out.println("Please enter a valid account number.");
					break;
				}
				if(!atm.isValidAmount(amount)) {
					System.out.println("Enter a valid amount!");
					break;
				}
				int availAmount = atm.deposite(customers.get(index2), account, amount);
				if(availAmount >= 0) {
					customers.get(index2).setBalance(availAmount);
				}
				atm.showBalance(customers.get(index2));
				break;
			default:
				break;
			}
		}
		System.out.println("Program complete...");
	}
}
