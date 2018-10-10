package com.zxx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zxx.entity.StudentEntity;
import com.zxx.service.StudentInfoService;

/**
 * @author zxx
 * @date 2018/10/9 22:18
 */
public class StudentInfoAction extends ActionSupport {

    private int STUDENTID;
    private String STUDENT_NMAE;
    private String STUDENT_PASSWORD;
    private String STUDENT_MAJOR;


    @Override
    public String execute()  {

        StudentInfoService studentInfoService =new StudentInfoService();

        try {
            StudentEntity studentEntity = (StudentEntity) studentInfoService.getStudentEntity();
            STUDENTID = studentEntity.getStudentId();
            STUDENT_NMAE = studentEntity.getStudentName();
            STUDENT_PASSWORD = studentEntity.getStudentPassword();
            STUDENT_MAJOR = studentEntity.getStudentMajor();
            System.out.println(STUDENT_MAJOR+
                    STUDENT_PASSWORD+
                    STUDENT_NMAE+
                    STUDENTID);
            return SUCCESS;
        }catch (Exception e){
            return ERROR;
        }

    }



}
