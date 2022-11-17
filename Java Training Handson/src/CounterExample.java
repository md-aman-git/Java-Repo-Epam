class CounterExample {
	static int count = 0;// will get memory each time 
	//when the instance is created

	CounterExample() {
		count++;// incrementing value
		System.out.println(count);
	}

	public static void main(String args[]) {
		// Creating objects
		CounterExample c1 = new CounterExample();
		CounterExample c2 = new CounterExample();
		CounterExample c3 = new CounterExample();
	}
}