package jdbc_day9.assignment;

import java.sql.*;
import java.util.*;

class InputStudentDetails {
	int input(Scanner sc) {
		System.out.println("Please enter number of students you want to insert in DB = ");
		int number = sc.nextInt();
		return number;
	}
}

public class StudentDetailsJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want : ");
		System.out.println("1. Show details.");
		System.out.println("2. insert details.");
		System.out.print("Input : ");
		int what = sc.nextInt();
		DatabaseClassStudent dbObject = new DatabaseClassStudent();
		Statement statement = dbObject.createConnection();
		if(what == 1) {
			dbObject.showDetails(statement);
			sc.close();
			return;
		}
		int numberOfStudent = new InputStudentDetails().input(sc);
		
		StudentPrimaryDetail primaryObj = new StudentPrimaryDetail();
		int testCase = numberOfStudent;
		while(testCase-- > 0) {
			System.out.println("Student number " + (numberOfStudent - testCase) + " Details : ");
			primaryObj.inputDetails(sc, statement);
		}
		//go ahead with logic of showing both details at a time means primary and secondary;
		dbObject.showDetails(statement);
	}

}
