package com.epam.java8features.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Encode {
	public void base64demo() {
		String orgString = "Md Aman";
		try {
			String encodeString = Base64.getEncoder().encodeToString(orgString.getBytes("utf-8"));
			System.out.println("Org String : " + orgString);
			System.out.println("Encoded String : " + encodeString);
			String decodeString = new String(Base64.getDecoder().decode(encodeString.getBytes("utf-8")), "utf-8");
			System.out.println("Again decoded String : " + decodeString);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
