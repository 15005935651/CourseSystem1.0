package com.zxx.action;

import com.zxx.entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @author zxx
 * @date 2018/10/8 19:02
 */
public class UnitTest {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    @Test
    public void test(){


            Configuration configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
            session = sessionFactory.openSession();
            transaction = (Transaction)session.beginTransaction();

//            StudentEntity studentEntity = new StudentEntity();
//            studentEntity.setStudentId(123);
//            studentEntity.setStudentMajor("computer");
//            studentEntity.setStudentName("asd");
//            studentEntity.setStudentPassword("456");
            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setStudentId(123456);
            studentEntity.setStudentPassword("nan");
            studentEntity.setStudentName("maeh");
            session.save(studentEntity);



            transaction.commit();
            session.close();
            sessionFactory.close();

    }

}
