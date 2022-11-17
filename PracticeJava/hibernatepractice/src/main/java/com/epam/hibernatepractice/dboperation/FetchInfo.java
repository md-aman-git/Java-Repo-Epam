package com.epam.hibernatepractice.dboperation;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.epam.hibernatepractice.entity.Answer;
import com.epam.hibernatepractice.entity.Question;

public class FetchInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		TypedQuery<Question> query = session.createQuery("from Question");
		List<Question> questions = query.getResultList();
		
		Iterator<Question> itr = questions.iterator();
		while(itr.hasNext()) {
			Question q = itr.next();
			System.out.println("Question name : " + q.getQName());
			List<Answer> answers = q.getAnswers();
			answers.stream().forEach(ans -> 
				System.out.println("Answer : " + ans.getAnswer() + ", Posted by : " + ans.getPostedBy()));
		}
		transaction.commit();
		session.close();
	}

}
