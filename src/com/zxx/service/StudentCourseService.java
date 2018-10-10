package com.zxx.service;

import com.zxx.entity.StudentCourseEntity;
import com.zxx.util.UserInfoUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * @author zxx
 * @date 2018/10/10 19:45
 */
public class StudentCourseService {
    private static SessionFactory sessionFactory;
    private static Session session;
    private static Transaction transaction;

    private List<StudentCourseEntity> studentCourseEntity;



    static {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction =  session.beginTransaction();
    }

    public List<StudentCourseEntity> getStudentCourseEntity() {
        try{
            int user_id=123;
            Set<Integer> keys = UserInfoUtil.map.keySet();
            for(int a:keys){
                user_id=a;
            }
            Query query = session.createQuery("from StudentCourseEntity where studentId="+user_id);
            studentCourseEntity= query.list();
            transaction.commit();
            session.close();
            sessionFactory.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return studentCourseEntity;
    }


    @Test
    public void T(){
        Query query = session.createQuery("from StudentCourseEntity where studentId=111500521");
        studentCourseEntity= query.list();
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

}
