import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("xyz.txt");
			pw.println("Saved");
		} catch(/*ArithmeticException*/ FileNotFoundException e) {
			System.out.println("Exception Found..." + e);
		}
		System.out.println("Program Complete...");
		pw.close();
	}

}
