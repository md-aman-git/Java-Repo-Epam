package com.epam.java8features;

import com.epam.java8features.base64.Base64Encode;
import com.epam.java8features.constructorreference.ConstructorReferenceDemo;
import com.epam.java8features.defaultmethod.Animal;
import com.epam.java8features.defaultmethod.Dog;
import com.epam.java8features.defaultmethod.Mammal;
import com.epam.java8features.lambdaexpress.LambdaOperation;
import com.epam.java8features.lambdaexpress.SortNumberLambda;
import com.epam.java8features.optiondemo.OptionalDemo;
import com.epam.java8features.streamfeature.StreamFeature;

public class App 
{
    public static void main( String[] args )
    {
        //Default function demonstration
//    	Animal dog = new Dog();
//    	dog.walk();
//    	Animal.run();
//    	Mammal.run();
    	
    	//Stream api demonstration
//    	StreamFeature obj = new StreamFeature();
//    	obj.streamFunction();
    	
    	//lambda expression
//    	LambdaOperation obj = new LambdaOperation();
//    	obj.demoMethodLambda();
    	
//    	SortNumberLambda obj = new SortNumberLambda();
//    	obj.sortingMethod();
//    	System.out.println("Hello");
    	
    	//DateTime API
//    	DateTimeFeature feature = new DateTimeFeature();
//    	feature.dateTimeFeateures();
    	
    	//Optional Demo
//    	OptionalDemo demo = new OptionalDemo();
//    	demo.optionalDemoMethod();
    	
    	//Constructor Demo
//    	ConstructorReferenceDemo demo = new ConstructorReferenceDemo();
//    	demo.demoMethod();
    	
    	//base64 Demo
    	Base64Encode demo = new Base64Encode();
    	demo.base64demo();
    }
}
