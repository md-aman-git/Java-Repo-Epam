package com.javacodegeeks.example;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateTestMappingProgram {
	private static SessionFactory factory;
	private static ServiceRegistry serviceRegistry;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Department.class);
		config.addResource("Department.hbm.xml");
		config.addAnnotatedClass(Employee.class);
		config.addResource("Employee.hbm.xml");
		
		config.addAnnotatedClass(User.class);
		config.addResource("User.xml");
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		factory = config.buildSessionFactory(serviceRegistry);
		
		HibernateTestMappingProgram hbTest = new HibernateTestMappingProgram();
		
		hbTest.insertEmployee(3,"Mark","Johnson","Sales",1);
		hbTest.insertEmployee(5,"Jill","Johnson","Marketing",2);
		
		hbTest.insertUser(8L, "Md", "Aman");
		

	}
	
	
	private long insertEmployee(int id, String firstname, String lastname, String deptName, int deptId)
	{
		Session session = factory.openSession();
		Transaction tx = null;
		Long empIdSaved = null;
		try {
			tx = session.beginTransaction();
		    Department d = new Department();
		    d.setDepartmentName(deptName);
		    d.setId(new Long(deptId));
			session.save(d);			
			Employee e = new Employee();
			e.setFirstname(firstname);
			e.setLastname(lastname);
			e.setId(new Long(id));
			e.setDepartment(d);
			empIdSaved = (Long) session.save(e);
			
			tx.commit();
		} catch(HibernateException ex) {
			if(tx != null)
				tx.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		
		return empIdSaved;
		
	}
	private long insertUser(Long id, String firstname, String lastname)
	{
		Session session = factory.openSession();
		Transaction tx = null;
		Long userId = null;
		try {
			tx = session.beginTransaction();
		    User user = new User();
		    user.setId(id);
		    user.setFirstname(firstname);
		    user.setLastname(lastname);	
			userId = (Long) session.save(user);
			
			tx.commit();
		} catch(HibernateException ex) {
			if(tx != null)
				tx.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		
		return userId;
		
	}

}
