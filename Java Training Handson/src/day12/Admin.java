package day12;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Admin implements AdminInterface {

	private Statement statement;
	@Override
	public void createEmployee(int emp_id, String emp_name) {
		// TODO Auto-generated method stub
		final String insertEmployee = "INSERT INTO employee (emp_id, emp_name, emp_role) VALUES(" 
				+ emp_id + ", '" + emp_name + "', " + null + ");";
		final String select = "SELECT * FROM employee WHERE emp_id = " + emp_id + "";
		try {
			statement = new DatabaseClass().createStatement();
			ResultSet rset = statement.executeQuery(select);
			if(rset.next()) {
				System.out.println("This employee ID already exist.");
				return;
			}
			statement.executeUpdate(insertEmployee);
			System.out.println("____________Employee created succesfully__________");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void assignRole(int emp_id, String role) {
		// TODO Auto-generated method stub
		final String select = "SELECT * FROM employee WHERE emp_id = " + emp_id + "";
		final String updateRoleEmployee = "UPDATE employee SET emp_role = '" + role + 
				"' WHERE emp_id = " + emp_id + ";";
		try {
			statement = new DatabaseClass().createStatement();
			ResultSet rset = statement.executeQuery(select);
			if(!rset.next()) {
				System.out.println("This employee ID does not exist.");
				return;
			}
			statement.executeUpdate(updateRoleEmployee);
			System.out.println("____________Employee Role Assigned succesfully__________");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
