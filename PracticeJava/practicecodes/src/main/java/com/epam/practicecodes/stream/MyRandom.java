package com.epam.practicecodes.stream;

public class MyRandom {
	private int id;
	private String otp;
	
	public MyRandom(int id, String otp) {
		this.id = id;
		this.otp = otp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "MyRandom [id=" + id + ", otp=" + otp + "]";
	}

	
}
