package com.github.hibernatedemo.models.simplemodels;

import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Student.getAllStudent", query = "from Student ")
@SelectBeforeUpdate //hibernate specific
public class Student {
    @Id
    @GeneratedValue
    private Integer studentId;
    private String name;
    private Integer rollNo;
    private String branch;

    public Student() {
    }

    public Student(String name, Integer rollNo, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
