package com.epam.day7;

interface Square {
	double area(double side);
}

public class AnonymousInnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square() {

			@Override
			public double area(double side) {
				// TODO Auto-generated method stub
				return 4 * side;
			}
			
		};
		
		System.out.println(sq.area(3));
	}

}
