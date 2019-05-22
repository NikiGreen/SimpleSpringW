package com.example.sweater.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String studentName;
    private String studentDiscipline;
    private String studentExam;
    private String studentSpecialty;
    private String studentExamList;
    private String studentDocument;
    private String studentEducation;
    private String studentAvarageMark;

    public Student(){

    }

    public Student(String studentName, String studentDiscipline, String studentExam, String studentSpecialty,
                   String studentExamList, String studentDocument, String studentEducation, String studentAvarageMark) {
        this.studentName = studentName;
        this.studentDiscipline = studentDiscipline;
        this.studentExam = studentExam;
        this.studentSpecialty = studentSpecialty;
        this.studentExamList = studentExamList;
        this.studentDocument = studentDocument;
        this.studentEducation = studentEducation;
        this.studentAvarageMark = studentAvarageMark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDiscipline() {
        return studentDiscipline;
    }

    public void setStudentDiscipline(String studentDiscipline) {
        this.studentDiscipline = studentDiscipline;
    }

    public String getStudentExam() {
        return studentExam;
    }

    public void setStudentExam(String studentExam) {
        this.studentExam = studentExam;
    }

    public String getStudentSpecialty() {
        return studentSpecialty;
    }

    public void setStudentSpecialty(String studentSpecialty) {
        this.studentSpecialty = studentSpecialty;
    }

    public String getStudentExamList() {
        return studentExamList;
    }

    public void setStudentExamList(String studentExamList) {
        this.studentExamList = studentExamList;
    }

    public String getStudentDocument() {
        return studentDocument;
    }

    public void setStudentDocument(String studentDocument) {
        this.studentDocument = studentDocument;
    }

    public String getStudentEducation() {
        return studentEducation;
    }

    public void setStudentEducation(String studentEducation) {
        this.studentEducation = studentEducation;
    }

    public String getStudentAvarageMark() {
        return studentAvarageMark;
    }

    public void setStudentAvarageMark(String studentAvarageMark) {
        this.studentAvarageMark = studentAvarageMark;
    }
}
