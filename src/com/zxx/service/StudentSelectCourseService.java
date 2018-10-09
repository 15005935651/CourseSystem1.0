package com.zxx.service;

import com.zxx.entity.CourseEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * @author zxx
 * @date 2018/10/9 16:33
 */
public class StudentSelectCourseService {
    private static SessionFactory sessionFactory;
    private static Session session;
    private static Transaction transaction;

    static {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction =  session.beginTransaction();
    }

    public List<CourseEntity> getCourseInfo() throws Exception{
        Query query = session.createQuery("from CourseEntity ");
        List<CourseEntity> courseEntityList =query.list();
        transaction.commit();
        session.close();
        sessionFactory.close();
        if(courseEntityList.size()>0)
            return courseEntityList;
        else
            return null;
    }

}
