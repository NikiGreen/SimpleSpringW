package com.example.sweater.controller;

import com.example.sweater.domain.falsedomain.*;
import com.example.sweater.repos.falserepos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TablesControllerImpl implements TablesController{

    private final AvarageMarkRepository avarageMarkRepository;
    private final DisciplineRepository disciplineRepository;
    private final DocumentRepository documentRepository;
    private final EducationRepository educationRepository;
    private final ExamListRepository examListRepository;
    private final ExamRepository examRepository;
    private final NameRepository nameRepository;
    private final SpecialtyRepository specialtyRepository;



    @Autowired
    public TablesControllerImpl(AvarageMarkRepository avarageMarkRepository, DisciplineRepository disciplineRepository,
                                DocumentRepository documentRepository, EducationRepository educationRepository, ExamListRepository examListRepository,
                                ExamRepository examRepository, NameRepository nameRepository, SpecialtyRepository specialtyRepository) {
        this.avarageMarkRepository = avarageMarkRepository;
        this.disciplineRepository = disciplineRepository;
        this.documentRepository = documentRepository;
        this.educationRepository = educationRepository;
        this.examListRepository = examListRepository;
        this.examRepository = examRepository;
        this.nameRepository = nameRepository;
        this.specialtyRepository = specialtyRepository;
    }



    public void addInTables(String studentName,  String studentDiscipline,  String studentExam,  String studentSpecialty,
                             String studentExamList,  String studentDocument,  String studentEducation, String studentAvarageMark){
        AvarageMark avarageMark=new AvarageMark(studentAvarageMark);
                Discipline discipline=new Discipline(studentDiscipline);
        Document document=new Document(studentDocument);
                Education education=new Education(studentEducation);
        Exam exam=new Exam(studentExam);
                ExamList examList=new ExamList(studentExamList);
        Name name=new Name(studentName);
                Specialty specialty=new Specialty(studentSpecialty);

        avarageMarkRepository.save(avarageMark);
        disciplineRepository.save(discipline);
        documentRepository.save(document);
        educationRepository.save(education);
        examListRepository.save(examList);
        examRepository.save(exam);
        nameRepository.save(name);
        specialtyRepository.save(specialty);
    }
}
