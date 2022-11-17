package com.epam.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Handler2 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Handler 2 action performed.");
	}

}
