package com.javabydeveloper.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.javabydeveloper.domain.Student;
//comment
public class GenRepo {
	EntityManagerFactory emf = null;
	EntityManager entityManager = null;
	EntityTransaction transaction = null;
	public GenRepo() {
		// TODO Auto-generated constructor stub
		
		

	}
	
	
	public void persit(Student s)
	{
		
		try {
		emf = Persistence.createEntityManagerFactory("jbd-pu");
		entityManager = emf.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(s);
		transaction.commit();
		}catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		} finally {
			entityManager.close();
			emf.close();
		}
	}
	
	public Student find(Long id)
	{
		Student s=null;
		try {
			emf = Persistence.createEntityManagerFactory("jbd-pu");
			entityManager = emf.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			s=entityManager.find(Student.class, id);
			transaction.commit();
			}catch (Exception e) {
				System.out.println(e);
				transaction.rollback();
			} finally {
				entityManager.close();
				emf.close();
				
			}
		return s;
	}
}
