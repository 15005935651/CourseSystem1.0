package com.zxx.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author zxx
 * @date 2018/10/10 21:35
 */
@Entity
@Table(name = "student_course", schema = "course_system", catalog = "")
public class StudentCourseEntity {
    private int studentId;
    private String courseName;
    private Integer studentCourseScore;
    private Double studentCourseCredit;
    private int id;
    private String studentName;
    private Timestamp courseTime;
    private String courseTeacher;

    @Basic
    @Column(name = "student_id")
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "student_name")
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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
    @Column(name = "course_teacher")
    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCourseEntity that = (StudentCourseEntity) o;
        return studentId == that.studentId &&
                id == that.id &&
                Objects.equals(courseName, that.courseName) &&
                Objects.equals(studentCourseScore, that.studentCourseScore) &&
                Objects.equals(studentCourseCredit, that.studentCourseCredit) &&
                Objects.equals(studentName, that.studentName) &&
                Objects.equals(courseTime, that.courseTime) &&
                Objects.equals(courseTeacher, that.courseTeacher);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentId, courseName, studentCourseScore, studentCourseCredit, id, studentName, courseTime, courseTeacher);
    }
}
