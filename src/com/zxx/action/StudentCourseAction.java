package com.zxx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zxx.entity.StudentCourseEntity;
import com.zxx.service.StudentCourseService;

import java.util.List;

/**
 * @author zxx
 * @date 2018/10/9 22:19
 */
public class StudentCourseAction extends ActionSupport {

    public List<StudentCourseEntity> getStudentCourseEntityList() {
        return studentCourseEntityList;
    }

    public void setStudentCourseEntityList(List<StudentCourseEntity> studentCourseEntityList) {
        this.studentCourseEntityList = studentCourseEntityList;
    }

    private List<StudentCourseEntity> studentCourseEntityList;

    @Override
    public String execute() throws Exception {
        StudentCourseService studentCourseService = new StudentCourseService();
        try {
            studentCourseEntityList= studentCourseService.getStudentCourseEntity();
            if(studentCourseEntityList.size()>0){
                return SUCCESS;
            }
            else {
                return ERROR;
            }
        } catch (Exception e){
            return ERROR;
        }

    }
}
