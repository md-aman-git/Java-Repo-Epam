package School;

import java.util.Scanner;

public class MainProgramme {

	public static void main(String[] args) {

		int choice;
		Scanner sc = new Scanner(System.in);

		System.out.println("Select the type of User");
		System.out.println("1. Administration");
		System.out.println("2 Staff");
		System.out.println("3. Student");
		choice = sc.nextInt();
		Utility util = new Utility();
		switch (choice) {
		case 1:
			util.adminMethod(sc);
			break;
		case 2:
			util.staffMethod(sc);
			break;
		case 3:
			util.studentMethod(sc);
			break;
		}

	}

}
