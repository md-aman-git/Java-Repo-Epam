
class Vehicle {
	int wheels;
	int headlights;
	int seats;

	void moves(int speed) {
		System.out.println("The vehicle is moving with the speed of " + speed + " kms/hr");
	}
}

class Truck {

	void display_move() {
		System.out.println("Truck is moving");
	}
}

class Car extends Vehicle {
	int mirrors;
	int gears;

	void gears(int gear) {
		System.out.println("The car is moving in " + gear + " th gear");
	}
}

class Alto extends Car {

	void display() {
		System.out.println("Inheriting Car and thereby Vehicle also");
	}

	void moves() { // over-riding the parent class method
		System.out.println("Alto is moving");
	}

}

public class InheritExample {

	public static void main(String[] args) {

		Car Swift = new Car();

		Swift.wheels = 4;
		Swift.headlights = 2;
		Swift.seats = 4;
		Swift.mirrors = 3;
		Swift.gears = 5;

		System.out.println("The wheels of the Swift car = " + Swift.wheels);

		Swift.moves(70);
		Swift.gears(5);

		Alto car1 = new Alto();

		car1.moves();
		car1.gears(4);
		car1.display();
	}
}
