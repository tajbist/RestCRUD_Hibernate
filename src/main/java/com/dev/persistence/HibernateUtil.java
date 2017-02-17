package com.dev.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Oops on 2/16/2017.
 */


public class HibernateUtil {

    private static HibernateUtil instance=new HibernateUtil();
    private SessionFactory sessionFactory;

    public static HibernateUtil getInstance(){
        return instance;
    }

    public HibernateUtil(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        sessionFactory = configuration.buildSessionFactory();
    }

    public static Session getSession(){
        Session session =  getInstance().sessionFactory.openSession();

        return session;
    }
}
