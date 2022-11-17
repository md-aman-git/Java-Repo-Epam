package day12;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TableUtility {
	void employeeTable() {
		DatabaseClass db = new DatabaseClass();
		String select = "SELECT * FROM employee";
		Statement statement = db.createStatement();
		ArrayList<Employee> info = new ArrayList<Employee>();
		try {
			ResultSet rset = statement.executeQuery(select);
			while(rset.next()) {
				info.add(new Employee(rset.getInt(1), rset.getString(2), rset.getString(3)));
			}
			new MyEmployeeTable().tableEmp(info);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void taskTable() {
		DatabaseClass db = new DatabaseClass();
		String select = "SELECT * FROM task_table";
		Statement statement = db.createStatement();
		ArrayList<TaskInfo> info = new ArrayList<TaskInfo>();
		try {
			ResultSet rset = statement.executeQuery(select);
			while(rset.next()) {
				info.add(new TaskInfo(rset.getInt(1), rset.getString(2), rset.getString(3)));
			}
			new MyEmployeeTable().tableTask(info);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void employee_workTable() {
		DatabaseClass db = new DatabaseClass();
		String select = "SELECT * FROM employee_work";
		Statement statement = db.createStatement();
		ArrayList<ManagerModal> info = new ArrayList<ManagerModal>();
		try {
			ResultSet rset = statement.executeQuery(select);
			while(rset.next()) {
				int emp_id = rset.getInt(1);
				int task_id = rset.getInt(2);
				String start_date = rset.getString(3);
				String end_date = rset.getString(4);
				String status = rset.getString(5);
				int manager_id = rset.getInt(6);
				String approved = rset.getString(7);
				ManagerModal mModal = new ManagerModal(emp_id, manager_id, task_id, start_date, 
						end_date, status, approved);
				info.add(mModal);
			}
			new MyEmployeeTable().tableWork(info);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
