package com.epam.day1;

public class BookClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setName("Java");
		book.setPages(130);
		System.out.println("Price of " + book.getName() + " = " + book.getPrice());
		
		//constructor chaining.
		Sum s = new Sum(9);
	}

}
