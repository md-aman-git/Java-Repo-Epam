package com.epam.designpattern.factory;

public class Manager extends Employee {

	public Manager(String name) {
		this.setName(name);
		this.setRole(Role.Manager);
	}

	public void approveTask(int id) {

// Database operation to update the task status to TaskStatus.APPROVED

	}

	public void removeTask(int id) {

// Database operation to update the task status to TaskStatus.APPROVED

	}
}
