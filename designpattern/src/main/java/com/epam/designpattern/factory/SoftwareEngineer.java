package com.epam.designpattern.factory;

public class SoftwareEngineer extends Employee {

	public SoftwareEngineer(String name) {
		this.setName(name);
		this.setRole(Role.SoftwareEngg);
	}

	public void startTask(int id) {

// Database operation to update the task status to TaskStatus.APPROVED

	}

	public void completeTask(int id) {

// Database operation to update the task status to TaskStatus.APPROVED

	}

	public void selfAssignTask(int id) {
		this.getId();
// Database operation to update the assignee to the current

	}

}
