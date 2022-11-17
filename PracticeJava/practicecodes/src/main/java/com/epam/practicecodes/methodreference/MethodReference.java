package com.epam.practicecodes.methodreference;

import java.util.ArrayList;
import java.util.List;
@FunctionalInterface
interface Parser {
	String parse(String str);
}
class StringParser {
	static String convert(String s) {
		if(s.length() <= 4) {
			s = s.toUpperCase();
		}
		else {
			s = s.toLowerCase();
		}
		return s;
	}
}

class MyPrinter {
	void print(String str, Parser p) {
		str = p.parse(str);
		System.out.println(str);
	}
}

interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }
}  
public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Md Aman";
		MyPrinter printer = new MyPrinter();
		printer.print(str, StringParser::convert);
		List<String> users = new ArrayList<String>();
		users.stream().forEach(System.out::println);
		
		Messageable hello = Message::new;  
        hello.getMessage("Hello");  
	}
	


}
