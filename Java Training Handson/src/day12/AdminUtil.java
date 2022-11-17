package day12;

import java.util.Scanner;

public class AdminUtil {
	Employee adminCreateEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter employee id : ");
		int emp_id = sc.nextInt();
		System.out.println("Please enter name of employee : ");
		String name = sc.next();
		Employee emp = new Employee(emp_id, name, null);
		return emp;
	}
	Employee adminAssignRole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter employee id : ");
		int emp_id = sc.nextInt();
		System.out.println("Please enter role to assign : ");
		String role = sc.next();
		Employee emp = new Employee(emp_id, role);
		return emp;
	}
	void adminWorks(int work) {
		Admin admin = new Admin();
		Employee employee;
		int emp_id = 0;
		switch(work) {
		case 1:
			System.out.println("Employee Creation Section");
			employee = adminCreateEmployee();
			emp_id = employee.getEmp_id();
			String name = employee.getEmp_name();
			admin.createEmployee(emp_id, name);
			break;
		case 2:
			System.out.println("Employee Role Assignment Section");
			employee = adminAssignRole();
			emp_id = employee.getEmp_id();
			String role = employee.getRole();
			admin.assignRole(emp_id, role);
			break;
		default:
			System.out.println("Invalid input. please enter correct input.");
			break;
		}
	}
}
