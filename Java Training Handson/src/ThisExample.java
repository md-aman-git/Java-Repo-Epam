
public class ThisExample {
	String name, company;
	int age;

	ThisExample() {
		System.out.println("ThisExample");
	}

	ThisExample(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}
	ThisExample(String name, int age, String company) {
		this(name, age); //real usage
		this.company = company;
		//this.(name, age); //this will give error 
		//since this must be called first
	}

	void func() {
		System.out.println("This to the method");
	}

	void display() {
		System.out.println("Name is : " + name + " and the age is : " + age);
		this.func();
	}
	void print() {
		System.out.println("Name is : " + name + 
				" and the age is : " + age + " Company is : " + company);
		this.func();
	}

	public static void main(String[] args) {
		ThisExample m = new ThisExample("EPAM", 17);
		ThisExample obj = new ThisExample("Super Man", 25, "EPAM System");
		m.display();
		obj.display();
	}

}
