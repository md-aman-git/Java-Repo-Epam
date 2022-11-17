
public class WhileExample {

	public static void main(String[] args) {
		int num = 8;

		while (num > 0) {
			System.out.println("The number is: " + num);
			num += 2;
			if (num == 100)
				break;
		}
	}

}
