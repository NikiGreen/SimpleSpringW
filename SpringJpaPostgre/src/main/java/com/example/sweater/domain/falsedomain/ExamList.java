package com.example.sweater.domain.falsedomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExamList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String studentExamList;

    public ExamList() {
    }

    public ExamList(String studentExamList) {
        this.studentExamList = studentExamList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentExamList() {
        return studentExamList;
    }

    public void setStudentExamList(String studentExamList) {
        this.studentExamList = studentExamList;
    }
}
