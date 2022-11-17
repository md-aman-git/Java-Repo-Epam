
public class PrePostIncrement {
	public static void main(String [] args) {
		int value = 10;
		System.out.println("Value = " + value);
		value--;
		System.out.println("Value = " + value++);
		value++;
		System.out.println("Value = " + value--);
		--value;
		System.out.println("Value = " + --value);
		++value;
		System.out.println("Value = " + ++value);
	}
}
