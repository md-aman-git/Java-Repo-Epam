package jdbc_day9.assignment;

import java.sql.Statement;
import java.util.Scanner;

class StudentSecondaryDetail {
	private String phone;
	private String father_name, address;
	StudentSecondaryDetail() {}
	public StudentSecondaryDetail(String phone, String father_name, String address) {
		this.phone = phone;
		this.father_name = father_name;
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	void inputDetails(Scanner sc, int id, Statement statement) {
		System.out.println("Please enter your phone number = ");
		phone = sc.next();
		System.out.println("Please enter your father name = ");
		father_name = sc.next();
		System.out.println("Please enter your address = ");
		address = sc.next();
		new DatabaseClassStudent().insertDBSecondary(statement, id, phone, father_name, address);
	}
}