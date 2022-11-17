package com.epam.userprofile.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.epam.userprofile.entity.User;
import com.epam.userprofile.util.HibernateUtil;

@Repository
public class UserRepo {
	
	public boolean checkLogin(String userName, String password) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = null;
		
		transaction = session.beginTransaction();
		List<User> users = session.createQuery("FROM User").list();
		for(User user : users) {
			if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
				return true;
			}
		}
		transaction.commit();
		return false;
	}
}
