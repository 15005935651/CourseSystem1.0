package com.zxx.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author zxx
 * @date 2018/10/9 22:24
 */
public class StudentInfoService {
    private static SessionFactory sessionFactory;
    private static Session session;
    private static Transaction transaction;

    static {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction =  session.beginTransaction();
    }



}
