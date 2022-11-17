
public class ForExample {
	public static void main(String [] args) {
		int i;
		for(i = 1; i < 10; i++) {
			System.out.println("i = " + i);
		}
		i = 5;
		for(; ;) {
			if(i == 15) break;
			System.out.println("i = " + i);
			i += 1;
		}
		int [] array = {2, 5, 8, 1, 9, 3, 5};
		for(int value : array) {
			System.out.println("value = " + value);
		}
	}
}
