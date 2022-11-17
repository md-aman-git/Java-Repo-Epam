package com.epam.springdemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.springdemo.entity.Order;

public class CustomerOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:applicationDemo.xml");

		Order order = appContext.getBean("order", Order.class);
//		order.getCustomer().setId(5);
//		order.getCustomer().setName("Aman");
//		
		System.out.println(order.getCustomer().getId() + " : " + order.getCustomer().getName());
	}

}
