package com.epam.day2;

import java.util.Scanner;

public class HospitalManagement implements Hospital {
	
	public Patient register() {
		Scanner sc = new Scanner(System.in);
		boolean broken = false;
		String name = "";
		while(!broken) {
			System.out.println("Please enter a valid name : ");
			name = sc.next();
			broken = checkForValidName(broken, name);
		}
		System.out.println("Please enter address : ");
		String address = sc.next();
		System.out.println("Please enter illness : ");
		String illness = sc.next();
		Patient p = new Patient(name, address, illness);
		return p;
	}
	public boolean feePaid(String paid) {
		return paid.equalsIgnoreCase("yes");
	}
	public department allocateDept(String illness) {
		if(illness.contains("heart")) {
			return department.HEART;
		}
		else if(illness.contains("hear")) {
			return department.ENT;
		}
		else if(illness.contains("cardio")) {
			return department.CARDIO;
		}
		return department.OTHERS;
	}
	boolean checkForValidName(boolean broken, String name) {
		String temp = name.toLowerCase();
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) < 'a' || temp.charAt(i) > 'z') {
				broken = false;
				break;
			}
			else {
				broken = true;
			}
		}
		return broken;
	}
	enum department {
		HEART,
		ENT,
		CARDIO,
		OTHERS
	}
}
