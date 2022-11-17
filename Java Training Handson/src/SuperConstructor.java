class Person {
	int age;
	String name;

	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

class Emp extends Person {
	float salary;

	Emp(int age, String name, float salary) {
		super(age, name);//this is the use
		this.salary = salary;
	}

	void display() {
		System.out.println(age + " " + name + " " + salary);
	}
}

public class SuperConstructor {
	public static void main(String[] args) {
		Emp e1 = new Emp(35, "Williams", 200000f);
		e1.display();
	}
}
