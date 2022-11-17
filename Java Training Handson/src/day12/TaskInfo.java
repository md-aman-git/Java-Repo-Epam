package day12;

public class TaskInfo {
	private int task_id;
	private String task_name, task_detail;
	public TaskInfo(int task_id, String task_name, String task_detail) {
		this.task_id = task_id;
		this.task_name = task_name;
		this.task_detail = task_detail;
	}
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getTask_detail() {
		return task_detail;
	}
	public void setTask_detail(String task_detail) {
		this.task_detail = task_detail;
	}
	
}
