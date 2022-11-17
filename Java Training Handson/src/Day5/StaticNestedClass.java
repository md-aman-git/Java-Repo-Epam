package Day5;

public class StaticNestedClass {
	static int speed = 120;
	static class Inner {
		void msg() {
			System.out.println("Inner static class msg method.");
		}
	}
	public static void main(String [] args) {
		StaticNestedClass.Inner obj = new StaticNestedClass.Inner();
		obj.msg();
	}
}
