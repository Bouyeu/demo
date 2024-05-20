package com.example.demo.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private  static final SessionFactory sessionFactory ;

    static {
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory= configuration.buildSessionFactory();
    }
    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
}
