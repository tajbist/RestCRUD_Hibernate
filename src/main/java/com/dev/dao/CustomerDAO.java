package com.dev.dao;

import com.dev.domain.Customer;
import com.dev.persistence.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Oops on 2/16/2017.
 */
public class CustomerDAO {
    public static Map<Long, Customer> cust = new HashMap<>();

    public static List<Customer> getCust() {
        List<Customer> users = new ArrayList<Customer>();
        Transaction trns = null;
        Session session = HibernateUtil.getSession();
        try {

            trns = session.beginTransaction();
            users = session.createQuery("from Customer").list();

        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }

        return users;
    }
}

