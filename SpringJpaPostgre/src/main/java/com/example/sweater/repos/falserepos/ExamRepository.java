package com.example.sweater.repos.falserepos;

import com.example.sweater.domain.falsedomain.AvarageMark;
import com.example.sweater.domain.falsedomain.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam,Long> {

}
