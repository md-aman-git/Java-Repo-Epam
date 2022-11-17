package com.epam.day8;

import java.util.ArrayList;import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> books = new ArrayList<>();

		Book book1 = new Book("Java", 512);
		Book book2 = new Book("JSP", 310);
		Book book3 = new Book("Servlet", 420);
		Book book4 = new Book("Data Structures", 670);
		Book book5 = new Book("Algoritms", 730);

		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);

		Stream<Book> stream = books.stream().filter(p -> p.getPrice() > 500);
		
		List<Book> filteredList = stream.collect(Collectors.toList());
		
		filteredList.forEach(b -> System.out.println(b));
		
		Stream<Book> stream2 = books.stream().filter(p -> p.getPrice() > 500);
		
		long count = stream2.count();
		
		System.out.println("Count of filtered books : " + count);
		
		System.out.println("After updating book name to uppercase letters and price greater than 500 : ");
		books.stream().filter(book -> book.getPrice() > 500)
			.map(book -> book.getName().toUpperCase()).forEach(book -> System.out.println(book));
		
		//books.stream().forEach(b -> System.out.println(b));
		
		books.stream().sorted((a, b) -> (int) b.getPrice() - (int) a.getPrice()).forEach(System.out::println);
		
		
	}

}
