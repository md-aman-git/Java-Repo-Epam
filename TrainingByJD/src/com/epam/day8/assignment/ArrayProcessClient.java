package com.epam.day8.assignment;

public class ArrayProcessClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProcess process = (a, b) -> {
			double res = 0.0;
			if (b == 1) {
				res = -Double.MAX_VALUE;
			} else if (b == 2) {
				res = Double.MAX_VALUE;
			}
			for (int i = 0; i < a.length; i++) {
				if (b == 0)
					res += a[i];
				else if (b == 1) {
					res = Math.max(res, a[i]);
				} else if (b == 2) {
					res = Math.min(res, a[i]);
				} else if (b == 3) {
					res += a[i];
				}
			}
			if (b == 3) {
				res /= a.length;
			}
			return res;
		};
		double[] arr = { 2.0, 5.0, 8.0, 1.0, 7.0, 12.0 };
		System.out.println("Sum = " + process.arraySolve(arr, 0));
		System.out.println("Max = " + process.arraySolve(arr, 1));
		System.out.println("Min = " + process.arraySolve(arr, 2));
		System.out.println("Average = " + process.arraySolve(arr, 3));
	}

}
