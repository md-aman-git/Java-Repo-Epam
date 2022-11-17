package com.epam.springdemo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ott")
public class OTT {
	private String name;
	private SubscriptionType sType;
	private int screen;
	
	public OTT() {}
	
	public OTT(String name, SubscriptionType sType, int screen) {
		super();
		this.name = name;
		this.sType = sType;
		this.screen = screen;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SubscriptionType getsType() {
		return sType;
	}

	public void setsType(SubscriptionType sType) {
		this.sType = sType;
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}



	public enum SubscriptionType {
		YEARLY,
		MONTHLY,
		WEEKLY
	}
}
