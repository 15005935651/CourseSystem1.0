package com.zxx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zxx.entity.CourseEntity;
import com.zxx.service.StudentSelectCourseService;

import java.util.List;

/**
 * @author zxx
 * @date 2018/10/9 16:31
 */
public class StudentSelectCourseAction extends ActionSupport {
    private List<CourseEntity> courseEntityList;

    public List<CourseEntity> getCourseEntityList() {
        return courseEntityList;
    }

    public void setCourseEntityList(List<CourseEntity> courseEntityList) {
        this.courseEntityList = courseEntityList;
    }

    @Override
    public String execute() throws Exception {
        StudentSelectCourseService studentSelectCourseService = new StudentSelectCourseService();
        try {
            courseEntityList = studentSelectCourseService.getCourseInfo();
            return SUCCESS;
        } catch (Exception e) {
            return ERROR;
        }
    }


}
