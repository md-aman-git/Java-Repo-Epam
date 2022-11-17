import java.io.*;

public class ThrowsExample {
	void m() throws IOException {
		throw new IOException("Device not found");
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] Args) {
		ThrowsExample obj = new ThrowsExample();

		obj.p();

		System.out.println("Walking-Out");
	}

}
