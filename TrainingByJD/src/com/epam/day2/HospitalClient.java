package com.epam.day2;

import java.util.ArrayList;
import java.util.Scanner;

import com.epam.day2.HospitalManagement.department;

public class HospitalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalManagement hm = new HospitalManagement();
		String looper = "Y"; 
		ArrayList<Patient> patients = new ArrayList<Patient>();
		Scanner sc = new Scanner(System.in);
		while(looper.equalsIgnoreCase("Y")) {
			System.out.println("Please give inputs : ");
			Patient p = hm.register();
			System.out.println("Amount paid or not (yes/no) = ");
			String fees = sc.next();
			if(hm.feePaid(fees)) {
				patients.add(p);
				department dpt = hm.allocateDept(p.getIllness());
				System.out.println("Registered success");
				System.out.println("department allocated : " + dpt);
				System.out.println("ID allocated : " + patients.size());
			}
			else {
				System.out.println("Please pay required amount. Not yet registered");
			}
			System.out.println("(Y/N) 'Y' for yes to register more else no ");
			looper = sc.next();
		}
		for(Patient p : patients) {
			System.out.println(p.toString());
		}
	}

}
