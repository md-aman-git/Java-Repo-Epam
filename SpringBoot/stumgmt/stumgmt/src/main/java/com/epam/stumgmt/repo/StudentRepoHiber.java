package com.epam.stumgmt.repo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.epam.stumgmt.entity.Student;
import com.epam.stumgmt.util.HibernateUtil;

@Repository
public class StudentRepoHiber {

	public boolean checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			List students = session.createQuery("FROM Student").list();
			for (Iterator iterator = students.iterator(); iterator.hasNext();) {
				Student student = (Student) iterator.next();
				System.out.println(student.toString());
				if (username.equals(student.getUserName()) && password.equals(student.getPassword())) {
					return true;
				}
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}

	public void registerUser(String fullName, String username, String password) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		String studId = "STID-";
		try {
			tx = session.beginTransaction();
			//List<Student> students = session.createQuery("FROM Student").list();
			System.out.println("Student details------------->>>>>>>>>>>>");
			int numId = (int) session.createQuery("SELECT max(id) from Student").getSingleResult();
			int length = String.valueOf(numId).length();//1
			for(int i = 0; i < 5 - length; i++) {
				studId += "0";
			}
			studId = studId + String.valueOf(++numId);
			//STID-0000
			Student student = new Student();
			student.setFullName(fullName);
			student.setUserName(username);
			student.setPassword(password);
			student.setStudId(studId);
			session.save(student);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
