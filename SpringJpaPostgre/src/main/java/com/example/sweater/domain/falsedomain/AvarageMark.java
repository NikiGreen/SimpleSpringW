package com.example.sweater.domain.falsedomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AvarageMark {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String studentAvarageMark;

    public AvarageMark() {
    }

    public AvarageMark(String studentAvarageMark) {
        this.studentAvarageMark = studentAvarageMark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentAvarageMark() {
        return studentAvarageMark;
    }

    public void setStudentAvarageMark(String studentAvarageMark) {
        this.studentAvarageMark = studentAvarageMark;
    }
}
