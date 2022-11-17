package com.epam.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabase {
	Statement getStatement() throws SQLException {
		Statement statement = null;
		try {
			Connection con = getConnection();
			statement = con.createStatement();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statement;
	}
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String user = "root", password = "root";
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", 
				user, password);
		return con;
	}
}
