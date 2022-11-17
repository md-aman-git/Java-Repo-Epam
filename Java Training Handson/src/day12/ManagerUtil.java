package day12;

import java.util.Scanner;

public class ManagerUtil {
	ManagerModal managerTaskAssign() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter ID(manager) : ");
		int manager_id = sc.nextInt();
		System.out.println("Please enter task id to assign : ");
		int task_id = sc.nextInt();
		System.out.println("Please enter employee id : ");
		int emp_id = sc.nextInt();
		System.out.println("Please enter start date (e.g : '02/02/2022') : ");
		String st_date = sc.next();
		System.out.println("Please enter end date (e.g : '05/02/2022') : ");
		String end_date = sc.next();
		System.out.println("Please enter details : ");
		String details = sc.next();
		System.out.println("Please enter approval comments : ");
		String approve = sc.next();
		return new ManagerModal(emp_id, manager_id, task_id, st_date, end_date, details, "Assigned");
	}
	ManagerModal managerTaskApproval() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter employee id : ");
		int emp_id = sc.nextInt();
		System.out.println("Please enter your ID (manager) : ");
		int manager_id = sc.nextInt();
		System.out.println("Please enter task ID : ");
		int task_id = sc.nextInt();
		System.out.println("Please enter status approved/not-approved ('yes/no') : ");
		String approved = sc.next();
		return new ManagerModal(emp_id, manager_id, task_id, approved);
	}
	
	void managerWorks(int work) {
		Manager manager = new Manager();
		ManagerModal mModal;
		int emp_id = 0;
		int manager_id = 0, task_id = 0;
		String start_date, end_date, details, approved, task;
		switch(work) {
		case 1:
			System.out.println("Employee Task Assignment Section");
			mModal = managerTaskAssign();
			emp_id = mModal.getEmp_id();
			start_date = mModal.getSt_date();
			end_date = mModal.getEnd_date();
			details = mModal.getDetails();
			manager_id = mModal.getManager_id();
			task_id = mModal.getTask_id();
			manager.assignTask(emp_id, manager_id, task_id, start_date, end_date, details, "Assigned");
			break;
		case 2:
			System.out.println("Employee Task Approval Section");
			mModal = managerTaskApproval();
			emp_id = mModal.getEmp_id();
			task_id = mModal.getTask_id();
			approved = mModal.getApproved();
			manager_id = mModal.getManager_id();
			manager.approveTask(emp_id, manager_id, task_id, approved);
			break;
		default:
			System.out.println("Invalid input. please enter correct input.");
			break;
		}
	}
}
