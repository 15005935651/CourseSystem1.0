package com.zxx.entity;

import javax.persistence.*;
import java.util.Objects;
/**
 * @author zxx
 * @date 2018/10/8 19:01
 */
@Entity
@Table(name = "student", schema = "course_system")
public class StudentEntity {
    private int studentId;
    private String studentPassword;
    private String studentName;
    private String studentMajor;


    @Id
    @Column(name = "student_id")
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "student_password")
    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
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
    @Column(name = "student_major")
    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return studentId == that.studentId &&
                Objects.equals(studentPassword, that.studentPassword) &&
                Objects.equals(studentName, that.studentName) &&
                Objects.equals(studentMajor, that.studentMajor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentId, studentPassword, studentName, studentMajor);
    }
}
