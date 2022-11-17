package jdbc_day9;

import java.sql.*;

public class MysqlConExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String password = "aman@123", user = "root";
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/student",
							user, password);
			Statement stmt = (Statement) con.createStatement();
			ResultSet rset = stmt
					.executeQuery("select * from student_info");
			System.out.println("ID - " + "Name");
			System.out.println("------------");
			while(rset.next()) {
				System.out.println(rset.getInt(1) + " - " + rset.getString(2));
			}
			String insert = "INSERT INTO student_info (stud_id, name)" + 
					" VALUES (4, 'New Data');";
			stmt.executeUpdate(insert);
			ResultSet rset1 = stmt
					.executeQuery("select * from student_info");
			System.out.println("After Updates......");
			System.out.println("ID - " + "Name");
			System.out.println("------------");
			while(rset1.next()) {
				System.out.println(rset1.getInt(1) + " - " + rset1.getString(2));
			}
			con.close();
		} catch(Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
	}

}
