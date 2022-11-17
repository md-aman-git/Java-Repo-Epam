public class ProveThisExample {
	void m() {
		System.out.println("Object id = " + this);// prints same reference ID
	}

	public static void main(String args[]) {
		ProveThisExample obj = new ProveThisExample();
		System.out.println("Object id = " + obj);// prints the reference ID
		obj.m();
	}
}