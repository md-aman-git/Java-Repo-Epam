package com.epam.day4.assignment.fifaTicket;

import java.util.HashMap;

public class FifaClient {
	
	public static void main(String[] args) {
		Stadium stadium = new Stadium();
		HashMap<String, HashMap<String, Block>> zones = new HashMap<>();
		stadium.initializeZones(zones);
		stadium.menuWorks(zones);
	}
}
