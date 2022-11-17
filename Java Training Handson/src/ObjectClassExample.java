
public class ObjectClassExample {

	String name; // data member
	int age;

	void display() { // member method
		System.out.println("The name is : " + name);
		System.out.println("The age is : " + age);
	}

	public static void main(String[] args) {

		ObjectClassExample obj1 = new ObjectClassExample();// creating an object obj1

		obj1.name = "Santosh";
		obj1.age = 25;

		obj1.display();

		ObjectClassExample obj2 = new ObjectClassExample();// creating an object obj2

		obj2.name = "Kavita";
		obj2.age = 22;

		obj2.display();

	}

}