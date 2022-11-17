package jdbc_day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteEmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String password = "aman@123", user = "root";
			int n;
			System.out.print("Enter the dept name to be deleted = ");
			Scanner sc = new Scanner(System.in);
			String deptDel = sc.next();
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee",
							user, password);
			Statement stmt = con.createStatement();
			String delete = "DELETE FROM employee_info WHERE dept = '" + deptDel + "';";
			int val = stmt.executeUpdate(delete);
			if(val > 0) {
				System.out.println("Deleted records are = " + val);
			}
			else {
				System.out.println("No records to be deleted");
			}
			System.out.println("-----------Employee Information----------");
			System.out.println("ID - Name - Dept");
			ResultSet rset = stmt
					.executeQuery("select * from employee_info");
			while(rset.next()) {
				System.out.println(rset.getInt(1) + " - " + rset.getString(2) + " - " + rset.getString(3));
			}
			con.close();
		} catch(Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
	}

}
