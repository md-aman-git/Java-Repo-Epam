package com.epam.designpattern.mvc;

public class MvcClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Model
		StudentModel model = getStudentModel();
//		View
		StudentView view = new StudentView();
		
//		Controller
		StudentController controller = new StudentController(model, view);
//		working on view
		System.out.println("Updating view : ");
		controller.updateView();
//		working on model
		System.out.println("After working on model : ");
		controller.setStudentName("Khalid");
		controller.setStudentRoll(12);
		
//		again working view
		System.out.println("Again updating view : ");
		controller.updateView();
	}

	private static StudentModel getStudentModel() {
		// TODO Auto-generated method stub
		StudentModel model = new StudentModel();
		model.setName("Aman");
		model.setRollNumber(9);
		return model;
	}

}
