package com.musings.jpa.xmlsessionfactory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.musings.jpa.entities.User;

public class XMLHibernateSessionFactory {

	public static SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration().configure("hibernate.xml");
		configuration.addAnnotatedClass(User.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory(
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
		return sessionFactory;
	}

}
