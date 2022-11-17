package com.epam.springdemo.entity;

import org.springframework.beans.factory.DisposableBean;

public class Message implements DisposableBean {
	private String message;
	
	public Message() {}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello from destroy...");
	}
	
}
