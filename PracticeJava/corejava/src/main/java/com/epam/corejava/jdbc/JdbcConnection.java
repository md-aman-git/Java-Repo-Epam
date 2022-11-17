package com.epam.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcConnection {
	public static void main(String[] args) {
		try {
//			register the driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			String user = "root", password = "root";
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", user, password);

			// create statement
			Statement statement = connection.createStatement();
			
			// execute queries
			String sql = "SELECT * FROM demotable";
			ResultSet rset = statement.executeQuery(sql);
			while (rset.next()) {
				System.out.println("ID : " + rset.getInt(1));
				System.out.println("Name : " + rset.getString(2));
			}
			// close the connection
			rset.close();
			connection.close();
//			DriverManager.deregisterDriver(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
