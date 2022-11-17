package day12;

public class Employee {
	private int emp_id;
	private String emp_name, role;
	public Employee(int emp_id, String role) {
		this.emp_id = emp_id;
		this.role = role;
	}
	public Employee(int emp_id, String emp_name, String role) {
		this(emp_id, role);
		this.emp_name = emp_name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
