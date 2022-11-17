package com.epam.springdemo.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.epam.springdemo.entity.OTT.SubscriptionType;
import com.epam.springdemo.entity.Subscriber;

public class SubscriberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(); 
		appContext.scan("com.epam.springdemo.entity");
		appContext.refresh();
		
		Subscriber sub = (Subscriber) appContext.getBean("subscriber");
	    sub.getOtt().setName("Netflix");
	    sub.getOtt().setScreen(3);
	    sub.getOtt().setsType(SubscriptionType.MONTHLY);
	    
	    System.out.println("OTT Name : " + sub.getOtt().getName());
	    System.out.println("OTT Screen : " + sub.getOtt().getScreen());
	    System.out.println("OTT Subscription Type : " + sub.getOtt().getsType());
	}

}
