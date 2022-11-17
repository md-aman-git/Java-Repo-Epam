package com.epam.day7;

abstract class Cube {
	abstract double volume(double side);
}
public abstract class ExtendInnerClass extends Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube = new Cube() {

			@Override
			double volume(double side) {
				// TODO Auto-generated method stub
				return side * side * side;
			}
			
		};
		System.out.println(cube.volume(3));
	}
}
