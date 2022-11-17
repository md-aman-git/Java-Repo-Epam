package day12;

import java.util.Scanner;

public class SoftwareUtil {
	SoftwareModal softwareTaskAssign() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter task to assign : ");
		String task = sc.next();
		System.out.println("Please enter employee id : ");
		int emp_id = sc.nextInt();
		System.out.println("Please enter start date (e.g : '02/02/2022') : ");
		String st_date = sc.next();
		System.out.println("Please enter end date (e.g : '05/02/2022') : ");
		String end_date = sc.next();
		System.out.println("Please enter details : ");
		String details = sc.next();
		return new SoftwareModal(emp_id, task, st_date, end_date, details);
	}
	SoftwareModal softwareTaskStatus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter employee id : ");
		int emp_id = sc.nextInt();
		System.out.println("Please enter task-ID : ");
		int task_id = sc.nextInt();
		System.out.println("Please enter status ('start/completed') : ");
		String status = sc.next();
		return new SoftwareModal(emp_id, task_id, status);
	}
	
	void softwareWorks(int work) {
		SoftwareEngineer software = new SoftwareEngineer();
		SoftwareModal softModal;
		int emp_id = 0, task_id = 0;
		String start_date, end_date, details, status, task;
		switch(work) {
		case 1:
			System.out.println("Employee Task Status Section");
			softModal = softwareTaskStatus();
			emp_id = softModal.getEmp_id();
			task_id = softModal.getTask_id();
			status = softModal.getStatus();
			software.markTask(emp_id, task_id, status);
			break;
		case 2:
			System.out.println("Employee Self Assign Task Section");
			softModal = softwareTaskAssign();
			emp_id = softModal.getEmp_id();
			task = softModal.getTask();
			start_date = softModal.getStart_date();
			end_date = softModal.getEnd_date();
			details = softModal.getDetails();
			software.selfAssignTask(emp_id, task, start_date, end_date, details);
			break;
		default:
			System.out.println("Invalid input. please enter correct input.");
			break;
		}
	}
}
