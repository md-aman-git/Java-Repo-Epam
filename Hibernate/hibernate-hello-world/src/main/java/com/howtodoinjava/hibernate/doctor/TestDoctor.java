package com.howtodoinjava.hibernate.doctor;

import org.hibernate.Session;

import com.howtodoinjava.hibernate.test.HibernateUtil;
import com.howtodoinjava.hibernate.test.dto.Student;

public class TestDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = com.howtodoinjava.hibernate.test
				.HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
//		Doctor doc = new Doctor("Hero", "12345", Specialisation.CARDIO);
		
		DoctorLombok doc = new DoctorLombok();
		doc.setName("Smith");
		doc.setReg_no("34590");
		doc.setSpecialization(Specialisation.CARDIO);
		session.save(doc);
		
		//System.out.println(doc.getName());
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}

