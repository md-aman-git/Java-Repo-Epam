package day4;

class Bone{
	final int speed = 110;
	final int gear;
	static final String brake;
	static {brake = "handbreak";}
	
	Bone(){
		//speed = 120;
		gear=5;
		//brake = "hand-brake";
		System.out.println("The speed is: "+speed);
	}
	
	 final void display() {
		System.out.println(" I can not be over-rided as I am the final");
	}
}
class Ctwo extends Bone{
	
//	void display() {
//		System.out.println(" I am over-riding the parent method");
//	}
}
public class FinalExample {	
	public static void main(String[] args) {
		Bone b=new Bone();
		b.display();
		Ctwo c= new Ctwo();
		c.display();
		System.out.println(c.gear);
		System.out.println(Ctwo.brake);
	}
}

