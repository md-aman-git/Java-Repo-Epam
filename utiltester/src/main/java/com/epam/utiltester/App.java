package com.epam.utiltester;

import java.time.LocalDateTime;

import com.epam.utility.MyUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LocalDateTime ldt = LocalDateTime.now();
        long epoch = MyUtil.localToEpoch(ldt);
        System.out.println("Epoch : " + epoch);
        
        System.out.println("Jahaj is palindrome : " + MyUtil.isPalindrome("Jahaj"));
    }
}
