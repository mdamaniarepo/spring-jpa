package com.musings.jpa.sessionfactory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.musings.jpa.entities.User;

public class HibernateSessionFactory {

	public static SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(User.class);
		return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
	}

}
