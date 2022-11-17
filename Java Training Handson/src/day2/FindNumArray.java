package day2;

import java.util.Scanner;

class FindNum {
	int size;
	int[] array;

	void takeInput() {
		System.out.print("Enter size of array = ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		array = new int[size];
		System.out.print("Enter elements in array = ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
	}

	void display() {
		System.out.print("Array = ");
		for (int value : array) {
			System.out.print(value + " ");
		}
	}

	boolean findNumber() {
		int num;
		System.out.print("\nEnter number to find = ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i : array) {
			if (i == num)
				return true;
		}
		return false;
	}

	void statusFind(boolean num) {
		if (num)
			System.out.println("Number found");
		else
			System.out.println("Number not found");
	}
}

public class FindNumArray {
	public static void main(String[] args) {
		FindNum fn = new FindNum();
		fn.takeInput();
		fn.display();
		fn.statusFind(fn.findNumber());
	}
}
