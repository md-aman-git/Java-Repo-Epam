package jdbc_day9.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

class DatabaseClassStudent {
	private Statement statement;
	Statement createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			final String password = "aman@123", user = "root";
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/student_db",
							user, password);
			statement = connection.createStatement();
		} catch(Exception e) {
			System.out.println("Exeption occured : " + e.getMessage());
		}
		return statement;
	}
	
	void insertDBPrimary(Statement statement, int id, String name, String dept) {
		if(statement != null) {
			String insert = "INSERT INTO student_primary_details (id, name, department)" + 
					" VALUES (" + id + ",'" + name + "','" + dept + "');";
			try {
				statement.executeUpdate(insert);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	void insertDBSecondary(Statement statement, int id, String phone, String father_name, String address) {
		if(statement != null) {
			String insert = "INSERT INTO student_secondary_details (id, phone, father_name, address)" + 
					" VALUES (" + id + ",'" + phone + "','" + father_name + "','" + address + "');";
			try {
				statement.executeUpdate(insert);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	void showDetails(Statement statement) {
		String query = "SELECT * FROM student_primary_details NATURAL JOIN student_secondary_details";
		try {
			ResultSet rset = statement.executeQuery(query);
			System.out.println("---------------------Student details using natural join-------------------- ");
			ArrayList<StudentInfo> studInfo = new ArrayList<StudentInfo>();
			while(rset.next()) {
				int id = rset.getInt(1);
				String name = rset.getString(2);
				String department = rset.getString(3);
				String phone = rset.getString(4);
				String father = rset.getString(5);
				String address = rset.getString(6);
				StudentInfo student = new StudentInfo(id, name, department, phone, father, address);
				studInfo.add(student);
			}
			MyTable table = new MyTable();
			table.table(studInfo);
		} catch(Exception e) {
			System.out.println("Exception in show details : " + e.getMessage());
		}
	}
	
}