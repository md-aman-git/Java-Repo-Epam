
public class Employee {
	private String empType, empName;
	Employee(String empType, String empName) {
		this.empType = empType;
		this.empName = empName;
	}
	int salary(int basic, int hra) {
		return basic + hra;
	}
	int salary(int basic, int hra, int med, int fuel) {
		return basic + hra + med + fuel;
	}
	int salary(int basic, int hra, int da, int fuel, int salesBonus) {
		return basic + hra + da + salesBonus + fuel;
	}
	String empType() {
		return this.empType;
	}
	String empName() {
		return this.empName;
	}
	public static void main(String[] args) {
		Employee rahul = new Employee("Engineer", "Rahul");
		Employee vinay = new Employee("Manager", "Vinay");
		Employee ilyas = new Employee("Director", "Ilyas");
		int salary = 0, basic = 25000, hra = 10000, 
				fuel = 10000, med = 1500, bonus = 50000;
		
		salary = rahul.salary(basic, hra);
		System.out.println(rahul.empName() + " is an " + rahul.empType() + " whose salary is " + salary);
		
		salary = vinay.salary(basic, hra, fuel, med);
		System.out.println(vinay.empName() + " is a " + vinay.empType() + " whose salary is " + salary);
		
		salary = ilyas.salary(basic, hra, fuel, med, bonus);
		System.out.println(ilyas.empName() + " is a " + ilyas.empType() + " whose salary is " + salary);
		
	}
}
