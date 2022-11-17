package jdbc_day9.assignment;

import java.sql.Statement;
import java.util.Scanner;

class StudentPrimaryDetail {
	private int id;
	private String name, dept;
	StudentPrimaryDetail() {}
	public StudentPrimaryDetail(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	void inputDetails(Scanner sc, Statement statement) {
		System.out.println("Please enter your id = ");
		id = sc.nextInt();
		System.out.println("Please enter your name = ");
		name = sc.next();
		System.out.println("Please enter your department = ");
		dept = sc.next();
		new DatabaseClassStudent().insertDBPrimary(statement, id, name, dept);
		new StudentSecondaryDetail().inputDetails(sc, id, statement);
	}
}