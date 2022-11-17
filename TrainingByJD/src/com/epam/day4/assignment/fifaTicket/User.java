package com.epam.day4.assignment.fifaTicket;

public class User {
	private String name, refId;
	private int age, uid;
	public User(String name, String refId, int age, int uid) {
		super();
		this.name = name;
		this.refId = refId;
		this.age = age;
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	
}
