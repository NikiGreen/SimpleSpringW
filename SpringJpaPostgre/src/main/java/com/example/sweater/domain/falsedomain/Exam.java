package com.example.sweater.domain.falsedomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String studentExam;

    public Exam() {
    }

    public Exam(String studentExam) {
        this.studentExam = studentExam;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentExam() {
        return studentExam;
    }

    public void setStudentExam(String studentExam) {
        this.studentExam = studentExam;
    }
}
