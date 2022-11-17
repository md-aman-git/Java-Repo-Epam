package com.epam.hibernatepractice.dboperation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.epam.hibernatepractice.entity.Answer;
import com.epam.hibernatepractice.entity.Question;

public class StoreInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metaData = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = metaData.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Answer a1 = new Answer();
		a1.setAnswer("Java is a programming language.");
		a1.setPostedBy("Aman");
		
		Answer a2 = new Answer();
		a2.setAnswer("Java is a platform.");
		a2.setPostedBy("Shubhangi");
		
		List<Answer> answers1 = new ArrayList<>();
		answers1.add(a1);
		answers1.add(a2);
		Question q1 = new Question();
		q1.setQName("What is Java ?");
		q1.setAnswers(answers1);
		
		Answer a3 = new Answer();
		a3.setAnswer("Servlet is an interface.");
		a3.setPostedBy("Aman");
		
		Answer a4 = new Answer();
		a4.setAnswer("Servlet is an API.");
		a4.setPostedBy("Shubhi");
		
		List<Answer> answers2 = new ArrayList<>();
		answers2.add(a3);
		answers2.add(a4);
		Question q2 = new Question();
		q2.setQName("What is Servlet ?");
		q2.setAnswers(answers2);
		
		session.persist(q1);
		session.persist(q2);
		
		transaction.commit();
		session.close();
	}

}
