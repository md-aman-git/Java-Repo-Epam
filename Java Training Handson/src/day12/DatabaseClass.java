package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseClass {
	private Connection connection;
	private Statement statement;
	Statement createStatement() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		final String password = "aman@123", user = "root";
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_task", 
				user, password);
		statement = connection.createStatement();
		} catch(Exception e) {
			System.out.println("Exception in creating connection-statement : " + e.getMessage());
		}
		return statement;
	}
	void closeConnection() {
		if(connection != null) {
			try {
				connection.close();
				System.out.println("Connection closed for database succesfully.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
