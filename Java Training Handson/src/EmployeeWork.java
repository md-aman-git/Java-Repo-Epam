class Employees {
	void work() {
		System.out.println("Employee work for 8 hours on his/her deliverables.");
	}
}
class Lead extends Employees {
	void workLead() {
		System.out.println("He also prepares a report for work.");
	}
}
class Manager extends Lead {
	void workManage() {
		System.out.println("Also he manages the team.");
	}
}
public class EmployeeWork {
	
	public static void main(String [] args) {
		System.out.println("For Employee : ");
		Employees e = new Employees();
		e.work();
		System.out.println("For Lead : ");
		Lead lead = new Lead();
		lead.work();
		lead.workLead();
		System.out.println("For Manager : ");
		Manager m = new Manager();
		m.work();
		m.workLead();
		m.workManage();
	}
}
