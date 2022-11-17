package com.epam.api_class_self_study.classes;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat format = NumberFormat.getInstance();
		Locale [] l = format.getAvailableLocales();
		System.out.println("LocalesAvailable = " + Arrays.toString(l));
		System.out.println("US : " + format.getCurrency().getDisplayName());
		
		System.out.println("Symbol for US : " + format.getCurrency().getSymbol());
		Currency currency = Currency.getInstance("INR");
		
		format.setCurrency(currency);
		System.out.println(format.getCurrency());
		System.out.println("Symbol : " + format.getCurrency().getSymbol());
		
		System.out.println("Display name : " + format.getCurrency().getDisplayName());
		
		NumberFormat obj = NumberFormat.getCurrencyInstance(Locale.US);
		double points = 1002.83;
		System.out.println("Points in US : " + obj.format(points));
		Locale IndiaHindi = new Locale("hi", "IN");
		Locale IndiaENG = new Locale("en", "IN");
		System.out.println("Points in Hindi India : " + NumberFormat.getCurrencyInstance(IndiaHindi).format(points));
		System.out.println("Points in English India : " + NumberFormat.getCurrencyInstance(IndiaENG).format(points));
	}

}
