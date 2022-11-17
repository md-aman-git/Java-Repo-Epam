package day12;

import java.util.ArrayList;

public class MyEmployeeTable {
	void tableEmp(ArrayList<Employee> info) {
		String leftAlignFormat = "| %-5d | %-10s | %-13s |%n";

		System.out.format("+-------+------------+---------------+%n");
		System.out.format("|Emp_ID | Emp_Name   | Emp_Role      |%n");
		System.out.format("+-------+------------+---------------+%n");
		for (int i = 0; i < info.size(); i++) {
		    System.out.format(leftAlignFormat, info.get(i).getEmp_id(), 
		    		info.get(i).getEmp_name(), info.get(i).getRole());
		}
		System.out.format("+-------+------------+---------------+%n");
	}
	void tableTask(ArrayList<TaskInfo> info) {
		String leftAlignFormat = "| %-5d | %-10s | %-13s |%n";

		System.out.format("+-------+------------+---------------+%n");
		System.out.format("|Task_ID| Task_Name  | Detail        |%n");
		System.out.format("+-------+------------+---------------+%n");
		for (int i = 0; i < info.size(); i++) {
		    System.out.format(leftAlignFormat, info.get(i).getTask_id(), 
		    		info.get(i).getTask_name(), info.get(i).getTask_detail());
		}
		System.out.format("+-------+------------+---------------+%n");
	}
	void tableWork(ArrayList<ManagerModal> info) {
		String leftAlignFormat = "| %-5d | %-7d | %-13s | %-13s | %-10s | %-6d | %-14s |%n";

		System.out.format("+-------+---------+---------------+---------------+------------+--------+----------------+%n");
		System.out.format("|Emp_ID | Task_ID | Start_date    |End_date       | Status     | Man_ID |Approved        |%n");
		System.out.format("+-------+---------+---------------+---------------+------------+--------+----------------+%n");
		for (int i = 0; i < info.size(); i++) {
		    System.out.format(leftAlignFormat, info.get(i).getEmp_id(), info.get(i).getTask_id(), 
		    		info.get(i).getSt_date(), info.get(i).getEnd_date(), info.get(i).getDetails(),
		    		info.get(i).getManager_id(), info.get(i).getApproved());
		}
		System.out.format("+-------+---------+---------------+---------------+------------+--------+----------------+%n");
	}
}