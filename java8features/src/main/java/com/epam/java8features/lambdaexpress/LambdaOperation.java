package com.epam.java8features.lambdaexpress;

public class LambdaOperation {
	public void demoMethodLambda() {
		LambdaExpressionOperation addition = (int val1, int val2) -> val1 + val2;
		LambdaExpressionOperation multiplication = (int val1, int val2) -> {
			//multiple lines
			int result = val1 * val2;
			return result;
		};
		
		System.out.println("Addition : " + addition.mathOperation(10, 5));
		System.out.println("Multiplication : " + multiplication.mathOperation(10, 5));
	}
}
