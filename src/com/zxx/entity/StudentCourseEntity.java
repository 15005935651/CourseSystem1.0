package com.zxx.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author zxx
 * @date 2018/10/8 19:01
 */
@Entity
@Table(name = "student_course", schema = "course_system", catalog = "")
public class StudentCourseEntity {
    private Integer studentId;
    private String studentCourse;
    private Integer studentCourseScore;
    private Double studentCourseCredit;

    @Basic
    @Column(name = "student_id")
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "student_course")
    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Basic
    @Column(name = "student_course_score")
    public Integer getStudentCourseScore() {
        return studentCourseScore;
    }

    public void setStudentCourseScore(Integer studentCourseScore) {
        this.studentCourseScore = studentCourseScore;
    }

    @Basic
    @Column(name = "student_course_credit")
    public Double getStudentCourseCredit() {
        return studentCourseCredit;
    }

    public void setStudentCourseCredit(Double studentCourseCredit) {
        this.studentCourseCredit = studentCourseCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCourseEntity that = (StudentCourseEntity) o;
        return Objects.equals(studentId, that.studentId) &&
                Objects.equals(studentCourse, that.studentCourse) &&
                Objects.equals(studentCourseScore, that.studentCourseScore) &&
                Objects.equals(studentCourseCredit, that.studentCourseCredit);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentId, studentCourse, studentCourseScore, studentCourseCredit);
    }

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
