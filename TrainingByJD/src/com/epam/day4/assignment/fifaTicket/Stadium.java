package com.epam.day4.assignment.fifaTicket;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Stadium {
	void menuWorks(HashMap<String, HashMap<String, Block>> zones) {
		Scanner sc = new Scanner(System.in);
		BookTicket book = new BookTicket();
		int input = -1, personId = -1;
		while (input != 0) {
			book.getOutputInstance().menuMethod();
			input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("Please enter your user ID : ");
				int userID = sc.nextInt();
				book.checkStatusQueue(zones, userID);
				break;
			case 2:
				personId = book.bookUsingRefId(zones, personId);
				break;
			case 3:
				personId = book.bookWitoutRefId(zones, personId);
				break;
			case 0:
				break;
			default:
				System.out.println("Please enter valid input...");
			}
		}
		sc.close();
		System.out.println("Program completed...\nThank you for using Fifa website...");
	}

	void initializeZones(HashMap<String, HashMap<String, Block>> zones) {
		long time = System.currentTimeMillis();
		int seats = 5;
		for (int i = 1; i <= 4; i++) {
			Queue<User> userQ1 = new LinkedList<>();
			Queue<User> userQ2 = new LinkedList<>();
			Queue<User> userQ3 = new LinkedList<>();
			Queue<User> userQ4 = new LinkedList<>();
			Block block1 = new Block(userQ1, seats, String.valueOf(time++));
			Block block2 = new Block(userQ2, seats, String.valueOf(time++));
			Block block3 = new Block(userQ3, seats, String.valueOf(time++));
			Block block4 = new Block(userQ4, seats, String.valueOf(time++));
			HashMap<String, Block> zone = new HashMap<>();
			zone.put("B1", block1);
			zone.put("B2", block2);
			zone.put("B3", block3);
			zone.put("B4", block4);
			zones.put("Z" + i, zone);
		}
	}

}
