package Day5;

class MultiThread extends Thread {
	public void run() {
		System.out.println("Thread is running...");
		System.out.println("Thread is running...");
		System.out.println("Thread is running...");
		System.out.println("Thread is running...");
		System.out.println("Thread is running...");
		System.out.println("Thread is running...");
		System.out.println("Thread is running...");
	}

	public static void main(String args[]) {
		MultiThread t1 = new MultiThread();
		t1.start();//it automatically calls run method..
		System.out.println(t1.getName());
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		t1.stop();
		//System.out.println(t1.getName()); //this also restarts thread
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		//System.out.println(t1.getName());
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		
		System.out.println("op...");
		//System.out.println(t1.getName());//this also restarts thread
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		//System.out.println(t1.getName());//this also restarts thread
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		//System.out.println(t1.getName());//this also restarts thread
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
		System.out.println("op...");
	}
}