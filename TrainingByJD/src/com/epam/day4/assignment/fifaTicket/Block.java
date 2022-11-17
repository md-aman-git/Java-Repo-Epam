package com.epam.day4.assignment.fifaTicket;

import java.util.Queue;

public class Block {

	private Queue<User> userQ;
	private int seats;
	private String bid;
	public Block(Queue<User> userQ, int seats, String bid) {
		super();
		this.userQ = userQ;
		this.seats = seats;
		this.bid = bid;
	}
	public Queue<User> getUserQ() {
		return userQ;
	}
	public void setUserQ(Queue<User> userQ) {
		this.userQ = userQ;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	
}
