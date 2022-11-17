package com.epam.day2;

public class Patient {
	private String name, address, illness;
	public Patient(String name, String address, String illness) {
		this.name = name;
		this.address = address;
		this.illness = illness;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", address=" + address + ", illness=" + illness + "]";
	}
	
}
