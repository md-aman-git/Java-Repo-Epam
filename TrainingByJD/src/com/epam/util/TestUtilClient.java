package com.epam.util;

import java.util.ArrayList;

import com.epam.day3.assignment.Book;
import com.epam.day3.assignment.Student;

public class TestUtilClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student(1, "Aman");
		Student st2 = new Student(3, "Rahul");
		ArrayList<Student> students = new ArrayList<>();
		students.add(st1);
		students.add(st2);
		System.out.println("--------Student Data------");
//		MyUtil.printList(students);
		Book book1 = new Book(2, 15, "Java");
		Book book2 = new Book(5, 19, "CPP");
		ArrayList<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		System.out.println("--------Book Data------");
//		MyUtil.printList(books);
	}

}
