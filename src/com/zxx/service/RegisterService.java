package com.zxx.service;

import com.zxx.entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * @author zxx
 * @date 2018/10/9 15:08
 */
public class RegisterService  {
    private static SessionFactory sessionFactory;
    private static Session session;
    private static Transaction transaction;

    static {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction =  session.beginTransaction();
    }

    public boolean idRegisterSuccess(int id,String username,String userpassword,String major){
        boolean result=false;
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentId(id);
        studentEntity.setStudentName(username);
        studentEntity.setStudentPassword(userpassword);
        studentEntity.setStudentMajor(major);
        try {
            session.save(studentEntity);
            transaction.commit();
            session.close();
            sessionFactory.close();
            result=true;
            return result;
        }catch (Exception e){
            session.close();
            sessionFactory.close();
        }
        return result;
    }


}
