package com.example.sweater.domain.falsedomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String studentDocument;

    public Document() {
    }

    public Document(String studentDocument) {
        this.studentDocument = studentDocument;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentDocument() {
        return studentDocument;
    }

    public void setStudentDocument(String studentDocument) {
        this.studentDocument = studentDocument;
    }
}

