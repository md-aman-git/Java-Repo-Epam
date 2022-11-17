package com.epam.practicecodes;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import com.epam.practicecodes.interfacejava8.ClassInterface;
import com.epam.practicecodes.interfacejava8.DefaultStaticInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String [] args)
    {
        System.out.println( "Hello World!" );
        ClassInterface obj = new ClassInterface();
        obj.print();
        obj.show();
        DefaultStaticInterface.division();
        
        LocalDate ldt = LocalDate.now();
        System.out.println("Local Date : " + ldt);
        Date date = Date.from(ldt.atStartOfDay(ZoneId.of("Asia/Kolkata")).toInstant());
        System.out.println("date : " + date);
        
        String a = new String("Sharma is a good player");
        String b = "Sharma is a good player";
        if(a == b)  
        {  
            System.out.println("a == b");  
        }  
        if(a.equals(b))  
        {  
            System.out.println("a equals b");  
        }  
        
    }
}
