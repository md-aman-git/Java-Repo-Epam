package com.epam.myfirstmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Book book = new Book();
    	book.setAuthor("RD Sharma");
    	System.out.println(book.toString());
    }
}
