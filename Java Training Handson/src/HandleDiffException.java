
public class HandleDiffException {
	public static void main(String[] args) {
		try {
			int data = 50 / 0; // may throw exception
			int [] arr = {1, 2};
			arr[3] = 4; //may throw exception
		}
		//to handle the ArithmeticException using 
		//ArrayIndexOutOfBoundsException
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("catch block");
		}
		System.out.println("rest of the code");
	}
}
