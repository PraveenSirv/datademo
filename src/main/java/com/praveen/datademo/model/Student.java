package com.praveen.datademo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Student {
    @Id
    private int sId;
    private String sName;
    private int sClass;

    public Student() {
    }

    public Student(int sId, String sName, int sClass) {
        this.sId = sId;
        this.sName = sName;
        this.sClass = sClass;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsClass() {
        return sClass;
    }

    public void setsClass(int sClass) {
        this.sClass = sClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sClass=" + sClass +
                '}';
    }
}
