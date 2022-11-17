package com.epam.day5;

import java.lang.annotation.Annotation;

public class AnnoTationTest {

	public static void main(String args[]) {
		System.out.println("Iphone13");
		Iphone13 ip = new Iphone13("13", 90000, 15.6);
		Class c1 = ip.getClass();
		Annotation an = c1.getAnnotation(SmartPhone.class);
		System.out.println(((SmartPhone) an).screen());
		System.out.println(((SmartPhone) an).os());

		System.out.println("SamsunA51");
		SamSungA51 a51 = new SamSungA51("a51", "others", 51000, 15.6);
		Class c2 = a51.getClass();
		Annotation anSam = c2.getAnnotation(SmartPhone.class);
		System.out.println(((SmartPhone) anSam).os());
		System.out.println(((SmartPhone) anSam).screen());
	}

}
