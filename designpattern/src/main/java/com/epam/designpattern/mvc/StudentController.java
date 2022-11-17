package com.epam.designpattern.mvc;

public class StudentController {
	StudentModel model;
	StudentView view;
	
	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	public void setStudentName(String name) {
		model.setName(name);
	}
	public void setStudentRoll(int roll) {
		model.setRollNumber(roll);
	}
	public String getStudentName() {
		return model.getName();
	}
	public int getStudentRoll() {
		return model.getRollNumber();
	}
	public void updateView() {
		view.showStudentDetails(model.getRollNumber(), model.getName());
	}
}
