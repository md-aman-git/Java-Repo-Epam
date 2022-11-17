
package com.howtodoinjava.hibernate.test;

import org.hibernate.Session;
import com.howtodoinjava.hibernate.test.dto.*;

public class TestHibernate {

	public static void main(String[] args) {
		Session session = com.howtodoinjava.hibernate.test.HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

//		Add new Employee object
//		EmployeeEntity emp = new EmployeeEntity();		
//		emp.setEmail("demo-user@mail.com");
//		emp.setFirstName("demo");
//		emp.setLastName("user");
		Student s = new Student();
		s.setStudent_id("S2");
		s.setStudent_fname("Md");
		s.setStudent_lname("Aman");
		session.save(s);
		
		Student st = session.get(Student.class, 1);//get no exception
		System.out.println(st.getName());
		
		Student st1 = session.load(Student.class, 1);//objectNotFound exception
		System.out.println(st1.getName());
		
		session.saveOrUpdate(st);
		System.out.println(st1.getName());
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();

	}

}
