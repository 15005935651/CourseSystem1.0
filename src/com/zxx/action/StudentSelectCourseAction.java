package com.zxx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zxx.entity.CourseEntity;
import com.zxx.service.StudentSelectCourseService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zxx
 * @date 2018/10/9 16:31
 */
public class StudentSelectCourseAction extends ActionSupport {
    private List<Integer> courseID = new ArrayList<Integer>();
    private List<String> courseName= new ArrayList<String>();
    private List<Date> course_time= new ArrayList<Date>();
    private List<String> course_classroom= new ArrayList<String>();
    private List<Double> course_credit= new ArrayList<Double>();
    private List<String> course_teacher= new ArrayList<String>();
    private List<Integer> course_num_of_stu=new ArrayList<Integer>();
    private List<CourseEntity> courseEntityList;




    @Override
    public String execute() throws Exception {
        StudentSelectCourseService studentSelectCourseService = new StudentSelectCourseService();
        courseEntityList = studentSelectCourseService.getCourseInfo();
        for (CourseEntity c:courseEntityList) {
            courseID.add(c.getCourseId());
            courseName.add(c.getCourseName());
            course_classroom.add(c.getCourseClassroom());
            course_teacher.add(c.getCourseTeacher());
            course_time.add(c.getCourseTime());
            course_num_of_stu.add(c.getCourseNumOfStu());
            course_credit.add(c.getCourseCredit());
            System.out.println(c.toString());
        }
        System.out.println(courseName);
        return SUCCESS;
    }


}
