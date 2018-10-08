package com.zxx.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author zxx
 * @date 2018/10/8 19:01
 */
@Entity
@Table(name = "course", schema = "course_system")
public class CourseEntity {
    private int courseId;
    private String courseName;
    private Timestamp courseTime;
    private String courseClassroom;
    private Double courseCredit;
    private String courseTeacher;
    private Integer courseNumOfStu;

    @Id
    @Column(name = "course_id")
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "course_name")
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Basic
    @Column(name = "course_time")
    public Timestamp getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Timestamp courseTime) {
        this.courseTime = courseTime;
    }

    @Basic
    @Column(name = "course_classroom")
    public String getCourseClassroom() {
        return courseClassroom;
    }

    public void setCourseClassroom(String courseClassroom) {
        this.courseClassroom = courseClassroom;
    }

    @Basic
    @Column(name = "course_credit")
    public Double getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Double courseCredit) {
        this.courseCredit = courseCredit;
    }

    @Basic
    @Column(name = "course_teacher")
    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    @Basic
    @Column(name = "course_num_of_stu")
    public Integer getCourseNumOfStu() {
        return courseNumOfStu;
    }

    public void setCourseNumOfStu(Integer courseNumOfStu) {
        this.courseNumOfStu = courseNumOfStu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseEntity that = (CourseEntity) o;
        return courseId == that.courseId &&
                Objects.equals(courseName, that.courseName) &&
                Objects.equals(courseTime, that.courseTime) &&
                Objects.equals(courseClassroom, that.courseClassroom) &&
                Objects.equals(courseCredit, that.courseCredit) &&
                Objects.equals(courseTeacher, that.courseTeacher) &&
                Objects.equals(courseNumOfStu, that.courseNumOfStu);
    }

    @Override
    public int hashCode() {

        return Objects.hash(courseId, courseName, courseTime, courseClassroom, courseCredit, courseTeacher, courseNumOfStu);
    }
}
