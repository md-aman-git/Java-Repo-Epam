package com.epam.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Associate {
	private String name;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Associate [name=" + name + ", salary=" + salary + "]";
	}

	public Associate(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class SortUsingAnonymousClass {

	public static void main(String[] args) {
		Associate a = new Associate("Bala", 10000);
		Associate a1 = new Associate("Manish", 15000);
		Associate a2 = new Associate("Jiban", 25000);
		Associate a3 = new Associate("Samrat", 6000);

		ArrayList<Associate> associates = new ArrayList<>();
		associates.add(a1);
		associates.add(a2);
		associates.add(a3);
		associates.add(a);
		System.out.println("\n-----------Before Sorting--------\n");
		for (Associate asso : associates) {
			System.out.println(asso);

		}
		
		//first method...
//		Collections.sort(associates, (o1, o2) -> {
//			Associate as1 = (Associate) o1;
//			Associate as2 = (Associate) o2;
//			if (as1.getSalary() > as2.getSalary()) {
//				return 1;
//			} else if (as1.getSalary() < as2.getSalary()) {
//				return -1;
//			} else {
//				return 0;
//			}
//		});
		
		//second method...
		Comparator c = (o1, o2) -> {
			Associate as1 = (Associate) o1;
			Associate as2 = (Associate) o2;
			if (as1.getSalary() > as2.getSalary()) {
				return 1;
			} else if (as1.getSalary() < as2.getSalary()) {
				return -1;
			} else {
				return 0;
			}
		};
		Collections.sort(associates, c);

		System.out.println("\n-----------After Sorting-----------\n");
		for (Associate asso : associates) {
			System.out.println(asso);

		}
	}

}