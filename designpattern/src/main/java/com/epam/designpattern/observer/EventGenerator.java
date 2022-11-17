package com.epam.designpattern.observer;

import java.util.Observable;

public class EventGenerator extends Observable {
	public void triggerEvent(String message) {
		
		System.out.println("DOING My own operations");
		addObserver(new Handler1());
		addObserver(new Handler1());
		
		
		setChanged();
		notifyObservers(message);
	}
}
