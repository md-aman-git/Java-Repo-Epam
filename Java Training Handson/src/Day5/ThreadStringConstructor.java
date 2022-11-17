package Day5;

public class ThreadStringConstructor {
	public static void main(String argvs[]) {
		// creating an object of the Thread class using 
		//the constructor Thread(String name)
		Thread t = new Thread("My thread");
		//the start()method moves the thread to the active state
		t.start();
		// getting the thread name by invoking the getName() method
		String str = t.getName();
		//System.out.println("Value");
		System.out.println(str);
	}
}
