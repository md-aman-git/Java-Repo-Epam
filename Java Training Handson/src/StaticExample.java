
public class StaticExample {
	static int data = 0;
	StaticExample() {
		data = data + 1;
	}
	static void func() {
		System.out.println("Function Call without object.");
	}
    void funcWithValue() {
		System.out.println("Function Call with object and value = " + data);
	}
	public static void main(String [] args) {
		System.out.println("Value without object creation = " + data);
		StaticExample e1 = new StaticExample();
		e1.funcWithValue();
		StaticExample e2 = new StaticExample();
		e2.funcWithValue();
		StaticExample e3 = new StaticExample();
		e3.funcWithValue();
		StaticExample e4 = new StaticExample();
		e4.funcWithValue();
		func();
	}
}
