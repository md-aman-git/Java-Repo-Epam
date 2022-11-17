package day12;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SoftwareEngineer implements SoftwareEngineerInterface {

	@Override
	public void markTask(int emp_id, int task_id, String markDone) {
		// TODO Auto-generated method stub
		DatabaseClass db = new DatabaseClass();
		Statement statement = db.createStatement();
		String markUpdate = "UPDATE employee_work SET status = '" + markDone +
				"' WHERE emp_id = " + emp_id + ";";
		String select = "SELECT * FROM employee_work WHERE emp_id = " + emp_id + ";";
		
		try {
			ResultSet rset = statement.executeQuery(select);
			if(!rset.next()) {
				System.out.println("No any task assigned yet to this employee");
				return;
			}
			String taskIdSelect = "SELECT * FROM task_table WHERE task_id = '" + task_id + "';";
			rset = statement.executeQuery(taskIdSelect);
			if(!rset.next()) {
				System.out.println("Task is not there with the given name. Please enter a valid task_name.");
				return;
			}
			String selectTask = "SELECT * FROM employee_work WHERE task_id = " + task_id + " && emp_id = " + emp_id + ";";
			rset = statement.executeQuery(selectTask);
			if(!rset.next()) {
				System.out.println("This Task-ID '" + task_id + "' not assigned yet to this employee");
				return;
			}
			statement.executeUpdate(markUpdate);
			System.out.println("__________Task status saved success________");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void selfAssignTask(int emp_id, String task, String start_date, String end_date, String detail) {
		// TODO Auto-generated method stub
		DatabaseClass db = new DatabaseClass();
		Statement statement = db.createStatement();
		int task_id = 0;
		String select = "SELECT * FROM employee_work";
		String selectEmp = "SELECT * FROM employee WHERE emp_id = " + emp_id + ";";
		try {
			ResultSet rset = statement.executeQuery(selectEmp);
			if(!rset.next()) {
				System.out.println("This employee does not exist....");
				return;
			}
			rset = statement.executeQuery(select);
			while(rset.next()) {
				task_id = Math.max(task_id, rset.getInt(1));
			}
			task_id++;
			String assignTask = "INSERT INTO employee_work(emp_id, task_id, st_date, end_date, status, manager_id, approved) VALUES (" + 
					emp_id + ", " + task_id + ", '" + start_date + "', '" + end_date + "', 'started'," + emp_id + ", 'Self-Assigned');";
			String insertTask = "INSERT INTO task_table(task_id, task_name, task_detail) VALUES (" + 
					task_id + ", '" + task + "', '" + detail + "');";
			statement.executeUpdate(insertTask);
			statement.executeUpdate(assignTask);
			System.out.println("__________Task self assigned success________");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
