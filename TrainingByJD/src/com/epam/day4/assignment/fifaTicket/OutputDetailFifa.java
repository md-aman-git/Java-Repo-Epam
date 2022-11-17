package com.epam.day4.assignment.fifaTicket;

public class OutputDetailFifa {
	void menuMethod() {
		System.out.println("Please select an option from below : ");
		System.out.println("1. Check your status in queue");
		System.out.println("2. Book ticket using reference ID");
		System.out.println("3. Book ticket withoout reference ID");
		System.out.println("0. Exit");
		System.out.println("_________________________________________");
		System.out.println("Your input : ");
	}

	void showDetails(String zoneNumber, String blockNumber, User myUser, String positionInQueue) {
		System.out.println("________________________________________");
		System.out.println("Booking status : ");
		System.out.println("Name : " + myUser.getName());
		System.out.println("Age : " + myUser.getAge());
		System.out.println("Zone Number : " + zoneNumber);
		System.out.println("Block Number : " + blockNumber);
		System.out.println("Reference Number : " + myUser.getRefId());
		System.out.println("User ID : " + myUser.getUid());
		System.out.println("Position in queue : " + positionInQueue);
		System.out.println("________________________________________");
	}

	void congratsMessage(String zoneNumber, String blockNumber, String refId, int uid, String positionInQueue) {
		System.out.println("Congratulations, you are in queue of the booking.");
		System.out.println("Booking status : ");
		System.out.println("Zone Number : " + zoneNumber);
		System.out.println("Block Number : " + blockNumber);
		System.out.println("Reference Number : " + refId);
		System.out.println("User ID : " + (uid - 1));
		System.out.println("Position in queue : " + positionInQueue);
	}
}
