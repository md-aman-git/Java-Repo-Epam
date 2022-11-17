package jdbc_day9.assignment;

public class StudentInfo {
	int id;
	String name;
	String department;
	String phone;
	String father;
	String address;
	
	public StudentInfo(int id, String name, String department, String phone, String father, String address) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.phone = phone;
		this.father = father;
		this.address = address;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
