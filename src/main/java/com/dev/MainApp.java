package com.dev;

/**
 * Created by Oops on 2/16/2017.
 */

import com.dev.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction trn = session.beginTransaction();

        Customer customer = new Customer();
        customer.setName("Taj Bist");
        customer.setEmail("tajbist2@gmail.com");
        customer.setPhone("324983248");
        session.persist(customer);
        trn.commit();
        session.close();
        ;
    }

}
