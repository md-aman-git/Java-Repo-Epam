package day12;

public interface ManagerInterface {
	void assignTask(int emp_id, int manager_id, int task_id, String start_date, String end_date, String details, String approved);
	void approveTask(int emp_id, int manager_id, int task_id, String approved);
}
