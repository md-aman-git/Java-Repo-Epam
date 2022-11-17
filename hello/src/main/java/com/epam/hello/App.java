package com.epam.hello;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student student = new Student();
        int id = student.getId();
        System.out.println("ID : " + id);
    }
}
