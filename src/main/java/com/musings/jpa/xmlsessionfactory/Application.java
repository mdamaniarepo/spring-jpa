package com.musings.jpa.xmlsessionfactory;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.musings.jpa.entities.User;

public class Application {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml")) {

			SessionFactory sessionFactory = context.getBean("xmlSessionFactory", SessionFactory.class);
			Session session = sessionFactory.getSessionFactory().openSession();
			session.beginTransaction();

			User user = new User();
			user.setFirstName("Kiaan");
			user.setLastName("Damania");
			user.setBirthDate(new Date());
			user.setCreationDate(new Date());
			user.setCreatedBy("App");
			user.setCreationChannel("testApp");
			user.setLastUpdateBy("testApp");
			user.setLastUpdatedDate(new Date());
			
			session.save(user);

			session.getTransaction().commit();
		}

	}

}
