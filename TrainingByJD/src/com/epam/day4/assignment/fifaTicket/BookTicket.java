package com.epam.day4.assignment.fifaTicket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class BookTicket {
	OutputDetailFifa output;
	static ArrayList<Integer> blockAssigned = new ArrayList<>();
	public BookTicket() {
		output = new OutputDetailFifa();
	}
	
	OutputDetailFifa getOutputInstance() {
		return output;
	}
	
	void checkStatusQueue(HashMap<String, HashMap<String, Block>> zones, int personId) {
		String zoneNumber = "N/A", blockNumber = "N/A", positionInQueue = "N/A";
		boolean foundData = false;
		User myUser = new User("N/A", "N/A", 0, 0);
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				HashMap<String, Block> mapBlock = zones.get("Z" + i);
				Block block = mapBlock.get("B" + j);
				Queue<User> userQ = block.getUserQ();
				int position = 1;
				for (User user : userQ) {
					if (user.getUid() == personId) {
						zoneNumber = "Z" + i;
						blockNumber = "B" + j;
						positionInQueue = position + "";
						myUser = user;
						break;
					}
					position++;
				}
				if (foundData) {
					break;
				}
			}
			if (foundData) {
				break;
			}
		}
		output.showDetails(zoneNumber, blockNumber, myUser, positionInQueue);
	}

	int bookUsingRefId(HashMap<String, HashMap<String, Block>> zones, int uid) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your reference ID : ");
		String refId = sc.next();
		boolean bookingQueued = false, blockFound = false, blockOtherQueue = false;
		String zoneNumber = "N/A", blockNumber = "N/A", positionInQueue = "N/A";
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				HashMap<String, Block> mapBlock = zones.get("Z" + i);
				Block block = mapBlock.get("B" + j);
				Queue<User> userQ = block.getUserQ();
				int tempCode = block.hashCode();
				String bid = block.getBid();
				String tempRefId = "REF_ID+" + tempCode + "BID+" + bid;
				if (tempRefId.equals(refId)) {
					if (block.getSeats() > 0) {
						System.out.println("Enter your name : ");
						String name = sc.next();
						System.out.println("Enter your age : ");
						int age = sc.nextInt();
						User newUser = new User(name, refId, age, uid++);
						userQ.add(newUser);
						block.setUserQ(userQ);
						block.setSeats(block.getSeats() - 1);
						zones.put("Z" + i, mapBlock);
						bookingQueued = true;
						zoneNumber = "Z" + i;
						blockNumber = "B" + j;
						positionInQueue = userQ.size() + "";
						blockFound = true;
						break;
					} else {
						System.out.println("No seats available in this queue/block.");
						System.out.println("Do you want to book seats in other zones/block ? (Y/N)");
						blockOtherQueue = bookInOtherBlocks(zones, uid);
					}
					blockFound = true;
				}
			}
			if (bookingQueued) {
				break;
			}
		}
		System.out.println("______________________________________________________");
		if(!blockFound) {
			System.out.println("You've entered a wrong reference ID...");
		}
		else if(blockOtherQueue) {
			System.out.println("Other blocks allocated...");
		}
		else if (!bookingQueued) {
			System.out.println("Sorry, all seats are full in this zone.");
		} else {
			output.congratsMessage(zoneNumber, blockNumber, refId, uid, positionInQueue);
		}
		System.out.println("_________________________________________________________");
		return uid;
	}


	int bookWitoutRefId(HashMap<String, HashMap<String, Block>> zones, int uid) {
		boolean bookingQueued = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		String refId = "N/A";
		String zoneNumber = "N/A", blockNumber = "N/A", positionInQueue = "N/A";
		for (int i = 1; i < 5; i++) {
			HashMap<String, Block> mapBlock = zones.get("Z" + i);
			int totalSeatsRemained = 0;
			while(true) {
				for (int j = 1; j < 5; j++) {
					Block block = mapBlock.get("B" + j);
					totalSeatsRemained += block.getSeats();
					if(blockAssigned.contains(j)) {
						continue;
					}
					if (block.getSeats() > 0) {
						Queue<User> userQ = block.getUserQ();
						String bid = block.getBid();
						if(uid == -1) {
							uid = userQ.getClass().hashCode();
						}
						int tempCode = block.hashCode();
						refId = "REF_ID+" + tempCode + "BID+" + bid;
						User newUser = new User(name, refId, age, uid++);
						userQ.add(newUser);
						block.setUserQ(userQ);
						block.setSeats(block.getSeats() - 1);
						zones.put("Z" + i, mapBlock);
						bookingQueued = true;
						zoneNumber = "Z" + i;
						blockNumber = "B" + j;
						positionInQueue = userQ.size() + "";
						blockAssigned.add(j);
						break;
					}
				}
				if (bookingQueued || totalSeatsRemained == 0) {
					break;
				}
				else {
					blockAssigned.clear();
				}
			}
			if (bookingQueued) {
				break;
			}
		}
		System.out.println("______________________________________________________");
		if (!bookingQueued) {
			System.out.println("Sorry, all seats are full in this zone.");
		} else {
			output.congratsMessage(zoneNumber, blockNumber, refId, uid, positionInQueue);
		}
		System.out.println("_________________________________________________________");
		return uid;
	}

	boolean bookInOtherBlocks(HashMap<String, HashMap<String, Block>> zones, int uid) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (input.equalsIgnoreCase("Y")) {
			bookWitoutRefId(zones, uid);
			return true;
		} else {
			System.out.println("Sorry, you have not opted to book in other blocks.");
		}
		return false;
	}
}
