package day12;

public interface SoftwareEngineerInterface {
	void markTask(int emp_id, int task_id, String markDone);
	void selfAssignTask(int emp_id, String task, String start_date, String end_date, String detaisl);
}
