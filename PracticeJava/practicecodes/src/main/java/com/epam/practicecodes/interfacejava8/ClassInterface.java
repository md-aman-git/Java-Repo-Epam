package com.epam.practicecodes.interfacejava8;

public class ClassInterface implements DefaultStaticInterface {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
	}

}
class IJ implements I, J {

	@Override
	public void add() {
		// TODO Auto-generated method stub
//		I.super.add();
//		J.super.add();
		System.out.println("This is add from inteface I, J default method");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("This is multi from inteface");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("This is sub from inteface");
	}
	
}
