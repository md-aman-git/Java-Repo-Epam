package com.epam.springdemo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("subscriber")
public class Subscriber {
	private String name;
	@Autowired
	private OTT ott;
	
	public Subscriber() {}
	public Subscriber(String name, OTT ott) {
		super();
		this.name = name;
		this.ott = ott;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public OTT getOtt() {
		return ott;
	}
	public void setOtt(OTT ott) {
		this.ott = ott;
	}
	
}
