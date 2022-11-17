package com.epam.designpattern.observer;

public class ObservableClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventGenerator event = new EventGenerator();
		event.triggerEvent("Triggered Event");
	}

}
