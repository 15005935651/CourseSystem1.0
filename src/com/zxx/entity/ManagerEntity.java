package com.zxx.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author zxx
 * @date 2018/10/8 19:01
 */
@Entity
@Table(name = "manager", schema = "course_system")
public class ManagerEntity {
    private int managerId;
    private String managerPassword;
    private String managerName;

    @Id
    @Column(name = "manager_id")
    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "manager_password")
    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    @Basic
    @Column(name = "manager_name")
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManagerEntity that = (ManagerEntity) o;
        return managerId == that.managerId &&
                Objects.equals(managerPassword, that.managerPassword) &&
                Objects.equals(managerName, that.managerName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(managerId, managerPassword, managerName);
    }
}
