package jdbc_day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDBExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String password = "aman@123", user = "root";
			int n;
			System.out.print("Enter number of employees = ");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			int id;
			String name, dept;
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee",
							user, password);
			Statement stmt = con.createStatement();
			while(n-- > 0) {
				System.out.println("Please enter id = ");
				id = sc.nextInt();
				System.out.println("Please enter name = ");
				name = sc.next();
				System.out.println("Please enter department = ");
				dept = sc.next();
				String insert = "INSERT INTO employee_info (id, name, dept)" + 
						" VALUES (" + id + "," + "'" + name + "'" + "," + "'" + dept + "'" + ");";
				stmt.executeUpdate(insert);
			}
			System.out.println("-----------Employee Information----------");
			System.out.println("ID - Name - Dept");
			ResultSet rset = stmt
					.executeQuery("select * from employee_info");
			while(rset.next()) {
				System.out.println(rset.getInt(1) + " - " 
						+ rset.getString(2) + " - " + rset.getString(3));
			}
			con.close();
		} catch(Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
	}
}
