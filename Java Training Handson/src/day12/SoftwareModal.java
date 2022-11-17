package day12;

public class SoftwareModal {
	private int emp_id, task_id;
	private String task, start_date, end_date, status, details;
	
	public SoftwareModal(int emp_id, int task_id, String status) {
		this.emp_id = emp_id;
		this.task_id = task_id;
		this.status = status;
	}
	public SoftwareModal(int emp_id, String task, String start_date, String end_date, String details) {
		this.emp_id = emp_id;
		this.task = task;
		this.start_date = start_date;
		this.end_date = end_date;
		this.details = details;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	
}
