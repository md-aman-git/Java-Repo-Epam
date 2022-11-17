package com.epam.trainingWithJd;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import com.epam.util.MyUtil;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	System.out.println("noon is palindrome : " + MyUtil.isPalindrome("noon"));
        System.out.println("madam is palindrome : " + MyUtil.isPalindrome("madam"));
        System.out.println("civic is palindrome : " + MyUtil.isPalindrome("civic"));
        System.out.println("jahaj is palindrome : " + MyUtil.isPalindrome("jahaj"));
        System.out.println("palindrome is palindrome : " + MyUtil.isPalindrome("palindrome"));
        System.out.println("a is palindrome : " + MyUtil.isPalindrome("a"));
        System.out.println("mom is palindrome : " + MyUtil.isPalindrome("mom"));
        System.out.println("racecar is palindrome : " + MyUtil.isPalindrome("racecar"));
        
        
    }
}
