class Jeep {
	int speed;

	Jeep() {
		System.out.println("Speed is: " + speed);
	}

	{
		System.out.println("Speed is set");
		speed = 110;
	}
	{
		System.out.println("Instance Initializer Invoked First");
	}
	{
		System.out.println("Second Instance Initializer Invoked First");
	}
}

class Scorpio extends Jeep {
	int drivewheel;

	Scorpio() {
		System.out.println("Scorpio " + drivewheel + " wheeler");
	}

	{
		drivewheel = 4;
	}
}

public class InstInitExample {
	public static void main(String[] args) {
		Scorpio s = new Scorpio();
	}
}
