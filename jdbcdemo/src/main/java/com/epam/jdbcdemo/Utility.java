package com.epam.jdbcdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Utility {
	public void printUserInfo() throws SQLException {
		Statement statement = new MyDatabase().getStatement();
		String insert = "INSERT INTO demotable VALUES(null, 'Md', 24);";
		statement.execute(insert);
		String query = "SELECT * FROM demotable";
		ResultSet rset = null;
		if (statement != null) {
			rset = statement.executeQuery(query);
			while (rset.next()) {
				System.out.println("ID : " + rset.getInt(1));
				System.out.println("Name : " + rset.getString(2));
				System.out.println("Age : " + rset.getInt(3));
				System.out.println("---------------------------");
			}
		}
	}

	public void saveImgToDB() throws SQLException, ClassNotFoundException, IOException {
		// we can use normal statements as well.
		String sql = "INSERT INTO imgtable VALUES(?, ?)";
		Connection connection = new MyDatabase().getConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, 1);
		String filePath = "C:\\Users\\Md_Aman\\Documents\\JDBC Image\\DriveToDB\\football.jpg";
		FileInputStream fin = new FileInputStream(filePath);
		statement.setBinaryStream(2, fin, fin.available());
		int number = statement.executeUpdate();
		System.out.println("Number of records update : " + number);
	}

	public void getImgFromDB() throws SQLException, ClassNotFoundException, IOException {
		//we can use normal statements as well.
		String sql = "SELECT * FROM imgtable";
		Connection connection = new MyDatabase().getConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet set = statement.executeQuery();
		String filePath = "C:\\Users\\Md_Aman\\Documents\\JDBC Image\\DbToDrive\\footballnew.png";
		if(set.next()) {
			Blob blob = set.getBlob(2);
			byte[] bArr = blob.getBytes(1, (int) blob.length());
			FileOutputStream fout = new FileOutputStream(filePath);
			fout.write(bArr);
			fout.close();
			//connection.close();
		}
	}
}
