package com.zxx.service;

import com.zxx.entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

/**
 * @author zxx
 * @date 2018/10/9 13:12
 */
public class LoginService {
    private static SessionFactory sessionFactory;
    private static Session session;
    private static Transaction transaction;

    static {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction =  session.beginTransaction();
    }

    public Boolean validate(int id,String userpassword) throws Exception {
        Boolean b = false;
        Query query = session.createQuery("from StudentEntity ");
        List<StudentEntity> studentEntities = query.list();

        for (StudentEntity s:studentEntities) {
            if(s.getStudentId()==id && s.getStudentPassword().equals(userpassword)){
                transaction.commit();
                session.close();
                sessionFactory.close();
                b=true;
            }
        }
        return b;
    }

}
