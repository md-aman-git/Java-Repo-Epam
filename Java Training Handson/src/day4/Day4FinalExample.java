package day4;
class FinalClassMethod {
	/*final*/ void notOverride() {
		System.out.println("NotOverride method invoked...");
	}
}
final class FinalClass {
	void method() {
		System.out.println("method method invoked...");
	}
}
class ExampleFinal extends FinalClassMethod {
    void notOverride() {
		System.out.println("Override method invoked...");
	}
}
class ExtendFinal /*extends FinalClass*/ {
	//final variable can not be re-assigned.
}
public class Day4FinalExample {
	public static void main(String [] args) {
		ExampleFinal ef = new ExampleFinal();//this will give error
		//FinalClassMethod f = new FinalClassMethod();
		ef.notOverride(); //resulting in first error it will also give error.
	}
}
