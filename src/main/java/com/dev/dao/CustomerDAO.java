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
            users = session.createQuery("from Customer ").list();

        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }

        return users;
    }

    public Customer getById(int id) {
        Transaction trns = null;
        Session session = HibernateUtil.getSession();
        Customer cust = null;
        try {
            trns = session.beginTransaction();
            cust = ( Customer ) session.createQuery("from Customer c").list().get(id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cust;
    }

    public Customer remove(int id) {
        Transaction trns = null;
        Session session = HibernateUtil.getSession();
        Customer cust = null;
        try {
            trns = session.beginTransaction();
            cust = ( Customer ) session.createQuery("from Customer c where c.id=:id")
                    .setParameter("id", id);
            session.delete(cust);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            trns.commit();
            session.close();
        }
        return cust;
    }

    public Customer save(Customer customer) {
        Transaction trans = null;
        Session session = HibernateUtil.getSession();
        try {
            trans = session.beginTransaction();
            session.persist(customer);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {

            trans.commit();
            session.close();
        }
        return customer;
    }
}

