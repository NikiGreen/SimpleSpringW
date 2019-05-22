package com.example.sweater.domain.falsedomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String studentEducation;

    public Education() {
    }

    public Education(String studentEducation) {
        this.studentEducation = studentEducation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentEducation() {
        return studentEducation;
    }

    public void setStudentEducation(String studentEducation) {
        this.studentEducation = studentEducation;
    }
}
