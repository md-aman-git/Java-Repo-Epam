package com.javabydeveloper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.javabydeveloper.domain.Student;
import com.javabydeveloper.repo.GenRepo;

/**
 * JPA Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		
			GenRepo repo= new GenRepo();
			
//			Student student = new Student();
//			student.setFirstName("Brian");
//			student.setLastName("Ray");
//			student.setContactNo("+1-408-575-1317");
//			
//			repo.persit(student);
//			Student student1 = new Student();
//			student1.setFirstName("Smith");
//			student1.setLastName("Andrew");
//			student1.setContactNo("+1-813-243-5177");
//			repo.persit(student1);
			
			
			Student s= repo.find(2L);
			System.out.println(s);
			
//			Query q = entityManager.createQuery("select s from Student s");
//
//			List<Student> resultList = q.getResultList();
//			System.out.println("num of sudents:" + resultList.size());
//			for (Student next : resultList) {
//				System.out.println("next student: " + next);
//			}

		  
	}
}
