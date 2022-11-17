package day2;
import java.util.Scanner;

class Complex {
	int real, img;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Real part = ");
		real = sc.nextInt();
		System.out.println("Enter Imaginary part = ");
		img = sc.nextInt();
	}
	void display() {
		System.out.println("Complex Number = " + real +
				" + " + img + "i");
	}
	Complex Sum(Complex C) {
		Complex res = new Complex();
		res.real = C.real + real;
		res.img = C.img + img;
		return res;
	}
	Complex Multi(Complex C) {
		Complex res = new Complex();
		res.real = C.real * real;
		res.real += -C.img * img;
		res.img = C.real * img + C.img * real;
		return res;
	}
}
public class Day2Complex {
	public static void main(String [] args) {
		//System.out.println("Enter First Complex = ");
		Complex A = new Complex();
		A.input();
		//System.out.println("Enter Second Complex = ");
		Complex B = new Complex();
		B.input();
		Complex res = A.Sum(B);
		System.out.println("Sum Complex = ");
		res.display();
		Complex mul = A.Multi(B);
		System.out.println("Multi Complex = ");
		mul.display();
	}
}
