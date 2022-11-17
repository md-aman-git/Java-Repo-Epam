package jdbc_day9.assignment;

import java.util.ArrayList;

public class MyTable {
	void table(ArrayList<StudentInfo> info) {
		String leftAlignFormat = "| %-2d | %-9s | %-10s | %-10s | %-13s | %-12s |%n";

		System.out.format("+----+-----------+------------+------------+---------------+--------------+%n");
		System.out.format("|ID  | Name      | Department |Phone       | Father Name   | Address      |%n");
		System.out.format("+----+-----------+------------+------------+---------------+--------------+%n");
		for (int i = 0; i < info.size(); i++) {
		    System.out.format(leftAlignFormat, info.get(i).getId(), info.get(i).getName(),
		    		info.get(i).getDepartment(), info.get(i).getPhone(), info.get(i).getFather(),
		    		info.get(i).getAddress());
		}
		System.out.format("+----+-----------+------------+------------+---------------+--------------+%n");
	}
}