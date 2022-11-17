package com.javabydeveloper.employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			emf = Persistence.createEntityManagerFactory("jbd-pu");
			entityManager = emf.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			Employee emp1 = new Employee("Aman", "123", 1500.0);
			Employee emp2 = new Employee("Rahul", "153", 1300.0);

			entityManager.persist(emp1);
			entityManager.persist(emp2);

			transaction.commit();

			Query q = entityManager.createQuery("select emp from Employee emp");

			List<Employee> resultList = q.getResultList();
			System.out.println("num of Employees :" + resultList.size());
			for (Employee next : resultList) {
				System.out.println("next employee : " + next);
			}

		} catch (Exception e) {
			System.out.println(e);
			if (transaction != null)
				transaction.rollback();
		} finally {
			if (entityManager != null)
				entityManager.close();
			if (emf != null)
				emf.close();
		}
	}

}
