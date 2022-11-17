
public class BreakAndContinue {
	public static void main(String [] args) {
		for(int i = 1; i <= 20; i++) {
			if(i == 3) continue;
			System.out.println("i = " + i);
			if(i % 13 == 0) break;
		}
	}
}
