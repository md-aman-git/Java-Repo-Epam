package com.epam.day5.assignment;

import java.lang.annotation.Annotation;

import com.epam.day5.Iphone13;
import com.epam.day5.SamSungA51;
import com.epam.day5.SmartPhone;

public class TestAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------Student----------------");
		Student stud = new Student(1, "Aman");
		Class c1 = stud.getClass();
		Annotation an = c1.getAnnotation(Vaccinated.class);
		System.out.println(((Vaccinated) an).type());
		System.out.println(((Vaccinated) an).booster());

		System.out.println("----------Senior citizen------------");
		SeniorCitizen scity = new SeniorCitizen(2, "Rahul");
		Class c2 = scity.getClass();
		Annotation an2 = c2.getAnnotation(Vaccinated.class);
		System.out.println(((Vaccinated) an2).type());
		System.out.println(((Vaccinated) an2).booster());
	}
}
