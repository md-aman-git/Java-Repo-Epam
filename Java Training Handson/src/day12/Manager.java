package day12;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager implements ManagerInterface {

	@Override
	public void assignTask(int emp_id, int manager_id, int task_id, String start_date,
			String end_date, String status, String approved) {
		// TODO Auto-generated method stub
		try {
			DatabaseClass db = new DatabaseClass();
			Statement statement = db.createStatement();
			String selectManagerList = "SELECT * FROM employee WHERE manager_id = " + manager_id + ";";
			ResultSet rset = statement.executeQuery(selectManagerList);
			if(!rset.next()) {
				System.out.println("Sorry you are not a manager.");
				return;
			}
			String assignTask = "INSERT INTO employee_work(emp_id, task_id, st_date, end_date, status, manager_id, approved)"
					+ " VALUES(" + emp_id + ", " + task_id + ",'" + start_date + "','" + end_date + "','" + status + "',"
					+ manager_id + ",'" + approved + "');";
			statement.executeUpdate(assignTask);
			System.out.println("Task Assigned Success.");
		} catch(SQLException e) {
			System.out.println("Exception in Manager class : " + e.getMessage());
		}
	}

	@Override
	public void approveTask(int emp_id, int manager_id, int task_id, String approved) {
		// TODO Auto-generated method stub
		try {
			DatabaseClass db = new DatabaseClass();
			Statement statement = db.createStatement();
			String selectManagerList = "SELECT * FROM employee WHERE emp_id = " + manager_id + ";";
			String isAlreadyAssignedTask = "SELECT * FROM employee_work WHERE manager_id = " + manager_id 
						+ " && task_id = " + task_id + ";";
			ResultSet rset = statement.executeQuery(selectManagerList);
			if(!rset.next()) {
				System.out.println("Sorry you are not a manager.");
				return;
			}
			rset = statement.executeQuery(isAlreadyAssignedTask);
			if(!rset.next()) {
				System.out.println("Sorry you have not assined this task-ID : " + task_id);
				return;
			}
			String markApproval = "UPDATE employee_work SET approved = '" + approved + "';";
			statement.executeUpdate(markApproval);
			System.out.println("Task status provided Approved/not-approved");
			
		} catch(SQLException e) {
			System.out.println("Exception in Manager class : " + e.getMessage());
		}
	}

}
