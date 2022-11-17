package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class DBConnection {
	private Statement statement;
	private Connection connection;
	Statement createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			final String password = "aman@123", user = "root";
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/hr_related_work",
							user, password);
			statement = connection.createStatement();
		} catch(Exception e) {
			System.out.println("Exeption occured : " + e.getMessage());
		}
		return statement;
	}
	void closeConnection() {
		if(connection != null) {
			try {
				connection.close();
				System.out.println("Connection Closed Success..");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
class InputOutput {
	void output() {
		System.out.println("--------------------------------------");
		System.out.println("Please enter input accordingly.");
		System.out.println("1. Add employee to a project.");
		System.out.println("2. Delete an employee.");
		System.out.println("3. Move Employee to other project.");
		System.out.println("4. Create a new project,");
		System.out.println("5. Delete a Project.");
		System.out.println("6. View Project-Employee details.");
		System.out.println("7. View Empoyee-Project details.");
		System.out.println("8. Exit.");
	}
	void caseOne(Scanner sc, Statement statement) {
		System.out.println("Please enter emp-id = ");
		int id = sc.nextInt();
		System.out.println("Please enter emp-name = ");
		String name = sc.next();
		System.out.println("Please enter project-name = ");
		String project_name = sc.next();
		String select = "SELECT * FROM employee WHERE emp_id = " + id + "";
		String selectProject = "SELECT * FROM project WHERE project_name = '" + project_name + "'";
		ResultSet rset;
		int p_id = 0;
		try {
			rset = statement.executeQuery(select);
			if(rset.next()) {
				System.out.println("This employee : " + id + " already exist.");
				return;
			}
			rset = statement.executeQuery(selectProject);
			if(rset.next()) {
				p_id = rset.getInt(1);
			}
			else {
				String insertProject = "INSERT INTO project (project_id, project_name)" + 
						" VALUES (" + (p_id + 1) + ",'" + project_name + "');";
				statement.executeUpdate(insertProject);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String insert = "INSERT INTO employee (emp_id, emp_name, project_name)" + 
				" VALUES (" + id + ",'" + name + "','" + project_name + "');";
		try {
			statement.executeUpdate(insert);
			
			System.out.println("Employee succesfully added.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new InputOutput().output();
	}
	void caseTwo(Scanner sc, Statement statement) {
		System.out.println("Please enter emp-id = ");
		int id = sc.nextInt();
		String delete = "DELETE FROM employee WHERE emp_id = " + id + ";";
		int value = 0;
		try {
			value = statement.executeUpdate(delete);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(value + " Employee succesfully deleted.");
		new InputOutput().output();
	}
	void caseThree(Scanner sc, Statement statement) {
		System.out.println("Please enter emp-id = ");
		int id = sc.nextInt();
		System.out.println("Please existing project = ");
		String exist_project = sc.next();
		System.out.println("Please enter new project = ");
		String new_project = sc.next();
		String select = "SELECT * FROM project WHERE project_name = '" + new_project + "'";
		String update = "UPDATE employee SET project_name = '" + new_project 
				+ "' WHERE emp_id = " + id + ";";
		int value = 0;
		try {
			ResultSet rset = statement.executeQuery(select);
			if(rset.next()) {
				value = statement.executeUpdate(update);
			}
			else {
				System.out.println("This project is not present already...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(value + " Employee project updated from " + exist_project + " to " + new_project);
		new InputOutput().output();
	}
	void caseFour(Scanner sc, Statement statement) {
		System.out.println("Please enter new project = ");
		String new_project = sc.next();
		String select = "SELECT * FROM project WHERE project_name = '" + new_project + "'";
		String selectAll = "SELECT * FROM project";
		ResultSet rset;
		int new_project_id = 0;
		try {
			rset = statement.executeQuery(select);
			if(rset.next()) {
				System.out.println("This project : " + new_project + " already exist.");
				return;
			}
			rset = statement.executeQuery(selectAll);
			while(rset.next()) {
				new_project_id = Math.max(new_project_id, rset.getInt(1));
			}
			new_project_id++;
			String insert = "INSERT INTO project (project_id, project_name)" + 
					" VALUES (" + new_project_id + ",'" + new_project + "');";
			statement.executeUpdate(insert);
			System.out.println("Project Added...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new InputOutput().output();
	}
	void caseFive(Scanner sc, Statement statement) {
		System.out.println("Please enter existing project to delete = ");
		String exist_project = sc.next();
		String select = "SELECT * FROM project WHERE project_name = '" + exist_project + "'";
		ResultSet rset;
		int project_id = 0;
		try {
			rset = statement.executeQuery(select);
			if(!rset.next()) {
				System.out.println("This project : " + exist_project + " does not exist.");
				return;
			}
			project_id = rset.getInt(1);
			String deleteProject = "DELETE FROM project WHERE project_id = " + project_id + ";";
			String updateEmployee = "UPDATE employee SET project_name = " + null + 
						" WHERE project_name = '" + exist_project + "';";
			statement.executeUpdate(deleteProject);
			statement.executeUpdate(updateEmployee);
			System.out.println("Project Deleted Success...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new InputOutput().output();
	}
	void caseSix(Scanner sc, Statement statement) {
		System.out.println("Please enter existing project for details = ");
		String exist_project = sc.next();
		String select = "SELECT * FROM project WHERE project_name = '" + exist_project + "'";
		ResultSet rset;
		try {
			rset = statement.executeQuery(select);
			if(!rset.next()) {
				System.out.println("This project : " + exist_project + " does not exist.");
				return;
			}
			String selectAllEmpProj = "SELECT * FROM employee NATURAL JOIN project WHERE project_name = '" 
							+ exist_project + "'";
			rset = statement.executeQuery(selectAllEmpProj);
			System.out.println("Emp_ID - Emp_Name - Project - Project_ID");
			while(rset.next()) {
				System.out.println(rset.getString(2) + " - " + rset.getString(3) + " - " 
						+ rset.getString(1) + 
						" - " + rset.getInt(4));
			}
			System.out.println("Project Details employee details...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new InputOutput().output();
	}
	void caseSeven(Scanner sc, Statement statement) {
		System.out.println("Please enter existing emp_id for details = ");
		int exist_id = sc.nextInt();
		String select = "SELECT * FROM employee WHERE emp_id = " + exist_id + "";
		ResultSet rset;
		try {
			rset = statement.executeQuery(select);
			if(!rset.next()) {
				System.out.println("This employee : " + exist_id + " does not exist.");
				return;
			}
			String selectAllEmpProj = "SELECT * FROM employee NATURAL JOIN project WHERE emp_id = " + 
						exist_id + "";
			rset = statement.executeQuery(selectAllEmpProj);
			System.out.println("Emp_ID - Emp_Name - Project");
			while(rset.next()) {
				System.out.println(rset.getString(2) + " - " + rset.getString(3) + " - " + rset.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new InputOutput().output();
	}
}
public class EmployeeDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputOutput io = new InputOutput();
		io.output();
		Scanner sc = new Scanner(System.in);
		DBConnection dbObj = new DBConnection();
		Statement statement = dbObj.createConnection();
		int input = 0;
		while(input != 8) {
			input = sc.nextInt();
			System.out.print("Option Selected : ");
			switch(input) {
			case 1:
				System.out.println(input);
				io.caseOne(sc, statement);
				break;
			case 2:
				System.out.println(input);
				io.caseTwo(sc, statement);
				break;
			case 3:
				System.out.println(input);
				io.caseThree(sc, statement);
				break;
			case 4:
				System.out.println(input);
				io.caseFour(sc, statement);
				break;
			case 5:
				System.out.println(input);
				io.caseFive(sc, statement);
				break;
			case 6:
				System.out.println(input);
				io.caseSix(sc, statement);
				break;
			case 7:
				System.out.println(input);
				io.caseSeven(sc, statement);
				break;
			case 8:
				System.out.println("Existing......");
				break;
			default:
				System.out.println("Invalid input...");
				break;
			}
		}
		System.out.println("Program complete...");
		dbObj.closeConnection();
	}

}
