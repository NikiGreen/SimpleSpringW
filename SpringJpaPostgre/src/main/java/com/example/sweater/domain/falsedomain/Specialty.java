package com.example.sweater.domain.falsedomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Specialty {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String studentSpecialty;

    public Specialty() {
    }

    public Specialty(String studentSpecialty) {
        this.studentSpecialty = studentSpecialty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentSpecialty() {
        return studentSpecialty;
    }

    public void setStudentSpecialty(String studentSpecialty) {
        this.studentSpecialty = studentSpecialty;
    }
}
