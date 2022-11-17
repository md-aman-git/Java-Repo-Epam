package com.epam.springdemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.springdemo.entity.Message;

public class MessageScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationDemo.xml");
		
		Message m1 = context.getBean("msg", Message.class);
		m1.setMessage("Hello, Aman");
		System.out.println("Message : " + m1.getMessage());
		
		Message m2 = context.getBean("msg", Message.class);
		//m2.setMessage("Hello, Rahul");
		//if scope singleton then object will be returned same;
		System.out.println("Message : " + m2.getMessage());
		context.close();
	}

}
