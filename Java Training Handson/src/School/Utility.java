package School;

import java.util.Scanner;

public class Utility {
	void adminMethod(Scanner sc) {
		int task;
		System.out.println("Welcome to the Admin section");
		Administration A = new Administration();
		System.out.println("Select Your Task");
		System.out.println("1. Create Modify Student");
		System.out.println("2. Create Modify Staff");
		System.out.println("3. Create Modify Subjects");
		System.out.println("4. Create Modify Sections");
		System.out.println("5. Create Modify Grades");
		System.out.println("6. Upload News");
		System.out.println("7. Check Fee pay by student");

		task = sc.nextInt();

		switch (task) {
		case 1:
			A.create_modify_student();
			break;
		case 2:
			A.create_modify_staff();
			break;
		case 3:
			A.create_modify_subjects();
			break;
		case 4:
			A.create_modifySections();
			break;
		case 5:
			A.create_modify_grades();
			break;
		case 6:
			A.upload_school_news();
			break;
		case 7:
			A.check_fee_payments();
			break;
		}
	}
	void staffMethod(Scanner sc) {
		int task;
		System.out.println("Welcome to the Staff section");
		Staff A = new Staff();
		System.out.println("Select Your Task");
		System.out.println("1. Admission Student");
		System.out.println("2. Examination Wrok");
		System.out.println("3. Assignment");
		System.out.println("4. Question bank");

		task = sc.nextInt();

		switch (task) {
		case 1:
			A.admitionstudent();
			break;
		case 2:
			A.examinationWork();
			break;
		case 3:
			A.assignmentwork();
			break;
		case 4:
			A.uploadQuestionBank();
			break;
		default:
			System.out.println("Invalid Input...");
			break;
		}
	}
	void studentMethod(Scanner sc) {
		int task;
		System.out.println("Welcome to the Student section");
		Student A = new Student();
		System.out.println("Select Your Task");
		System.out.println("1. Assignments submission");
		System.out.println("2. Download report");
		System.out.println("3. See announcement");
		System.out.println("4. Apply leaves");
		System.out.println("5. Give examination");
		System.out.println("6. Pay fees");

		task = sc.nextInt();

		switch (task) {
		case 1:
			A.AssignmentSubmision();
			break;
		case 2:
			A.downloadTestReport();
			break;
		case 3:
			A.SeeAnnouncement_News();
			break;
		case 4:
			A.ApplyLeave();
			break;
		case 5:
			A.Examination();
			break;
		case 6:
			A.FeePayment();
			break;
		default:
			System.out.println("Invalid Input...");
			break;
		}
	}
}
