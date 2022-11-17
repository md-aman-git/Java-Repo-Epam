
class A{
	
	A getA() {
		return this;
	}
	A getB() {
		return this;
	}
	void msg() {
		System.out.println("Hey, buddy");
	}
}

public class ThisCurrentClassInstance {
	public static void main(String[] args) {
		
		A a= new A();
		a.msg();
		new A().getA().msg();
		new A().msg();
		new A().getB().msg();
	}
}
