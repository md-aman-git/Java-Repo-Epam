package day12;

public class ManagerModal {
	private int emp_id, manager_id, task_id;
	private String st_date, end_date, details, approved;
	public ManagerModal(int emp_id, int manager_id, int task_id, String approved) {
		this.emp_id = emp_id;
		this.task_id = task_id;
		this.approved = approved;
		this.manager_id = manager_id;
	}
	public ManagerModal(int emp_id, int manager_id, int task_id, 
			String st_date, String end_date, String details, String approved) {
		this(emp_id, manager_id, task_id, approved);
		this.st_date = st_date;
		this.end_date = end_date;
		this.details = details;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getSt_date() {
		return st_date;
	}
	public void setSt_date(String st_date) {
		this.st_date = st_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	
}
