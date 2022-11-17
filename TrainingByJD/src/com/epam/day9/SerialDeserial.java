package com.epam.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.epam.day3.assignment.Book;

public class SerialDeserial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book(1, 20, "Let us c");

		try {
			FileOutputStream fileOutputStream
			= new FileOutputStream("C:\\\\Users\\\\Md_Aman\\\\Documents\\\\DemoSerialDeserial\\\\mybooklist.txt");
			ObjectOutputStream objectOutputStream
			= new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(b);
			objectOutputStream.flush();
			objectOutputStream.close();

			FileInputStream fileInputStream
			= new FileInputStream("C:\\Users\\Md_Aman\\Documents\\DemoSerialDeserial\\mybooklist.txt");
			ObjectInputStream objectInputStream
			= new ObjectInputStream(fileInputStream);

			Book b2 = (Book) objectInputStream.readObject();
			objectInputStream.close();
			System.out.println(b2.toString());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
