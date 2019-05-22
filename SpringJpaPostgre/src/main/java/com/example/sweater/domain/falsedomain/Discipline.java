package com.example.sweater.domain.falsedomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Discipline {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String studentDiscipline;

    public Discipline() {
    }

    public Discipline(String studentDiscipline) {
        this.studentDiscipline = studentDiscipline;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentDiscipline() {
        return studentDiscipline;
    }

    public void setStudentDiscipline(String studentDiscipline) {
        this.studentDiscipline = studentDiscipline;
    }
}
