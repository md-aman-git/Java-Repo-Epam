package com.epam.springpractice.client;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.epam.springpractice.entity.College;
import com.epam.springpractice.entity.Student;

public class CollegeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Resource resource = new ClassPathResource("applicationSpring.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.epam.springpractice.entity");
		context.refresh();
		

		College college = (College) context.getBean("college");
		System.out.println("College : " + college);
		Student student = (Student) context.getBean("my_stud");
		System.out.println("Student : " + student);
		student.getCollege().setCollegeName("BCE");
		student.getCollege().setId(2);
		student.setId(123);
		student.setName("Aman");
		System.out.println("Student after update : " + student);
		context.close();
	}
}
