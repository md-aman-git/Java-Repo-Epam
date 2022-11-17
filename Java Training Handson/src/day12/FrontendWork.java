package day12;

import java.util.Scanner;

public class FrontendWork {
	void menuMethod() {
		System.out.println("____________________________");
		System.out.println("1. Admin Work.");
		System.out.println("2. Manager Work.");
		System.out.println("3. Software Engineer Work.");
		System.out.println("4. Table View");
		System.out.println("0. Exit.");
		System.out.print("Please enter valid input : ");
	}
	void tableWorks() {
		System.out.println("Do you want to see tables ? (y/n) : ");
		Scanner sc = new Scanner(System.in);
		char what = sc.next().charAt(0);
		if(what == 'y' || what == 'Y') {
			System.out.println("____________________________");
			System.out.println("1. Employee Table.");
			System.out.println("2. Task Table.");
			System.out.println("3. Employee Work Table.");
			System.out.println("Any other input to Exit.");
			int whichTable = sc.nextInt();
			TableUtility tabUtil = new TableUtility();
			switch(whichTable) {
			case 1:
				tabUtil.employeeTable();
				break;
			case 2:
				//
				tabUtil.taskTable();
				break;
			case 3:
				//
				tabUtil.employee_workTable();
				break;
			default:
				System.out.println("Choosed not to show table.");
				break;
					
			}
		}
	}
	void utility() {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		AdminUtil adminUtil = new AdminUtil();
		SoftwareUtil softUtil = new SoftwareUtil();
		ManagerUtil mUtil = new ManagerUtil();
		while(loop) {
			menuMethod();
			int option = sc.nextInt();
			int work = -1;
			switch(option) {
				case 1:
					//admin work;
					System.out.println("--------Admin Works-------");
					System.out.println("1. Employee creation");
					System.out.println("2. Assign work to employee");
					System.out.println("Please enter input : ");
					work = sc.nextInt();
					adminUtil.adminWorks(work);
					break;
				case 2:
					//manager work;
					System.out.println("----------Manager Works---------");
					System.out.println("1. Employee Taks Assignment");
					System.out.println("2. Task approval");
					System.out.println("Please enter input : ");
					work = sc.nextInt();
					mUtil.managerWorks(work);
					break;
				case 3:
					//software engineer work;
					System.out.println("--------Software Engineer Works-------");
					System.out.println("1. Employee Taks Status");
					System.out.println("2. Self Assign Task");
					System.out.println("Please enter input : ");
					work = sc.nextInt();
					softUtil.softwareWorks(work);
					break;
				case 4:
					tableWorks();
					break;
				case 0:
					loop = false;
					break;
				default:
					System.out.println("Invalid input.");
					break;
			}
		}
		sc.close();
		System.out.println("Program completed...");
	}
	
}
