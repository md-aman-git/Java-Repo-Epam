import java.util.Scanner;

class Calculator {
	int num1, num2;
	char operator;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please two numbers and operator. e.g, 2 + 3 = ");
		num1 = sc.nextInt();
		operator = sc.next().charAt(0);
		num2 = sc.nextInt();
		sc.close();
	}
	void compute() {
		int res = 0;
		boolean catched = false;
		switch(operator) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			try {
				res = num1 / num2;
			} catch(ArithmeticException e) {
				catched = true;
				System.out.println(num1 + " can not be divided by zero.");
			}
			break;
		default:
			System.out.println("Invalid input...");
			catched = true;
			break;
		}
		if(!catched) System.out.println("Result = " + res);
	}
}
public class CalculatorExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.input();
		calculator.compute();
	}
}
