package Day5;

class ThreadWithRunnable implements Runnable {
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String [] args) {
		ThreadWithRunnable m1 = new ThreadWithRunnable();
		Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)
		t1.start();
	}
}
