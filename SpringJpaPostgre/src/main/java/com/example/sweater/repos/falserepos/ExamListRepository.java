package com.example.sweater.repos.falserepos;

import com.example.sweater.domain.falsedomain.AvarageMark;
import com.example.sweater.domain.falsedomain.ExamList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamListRepository extends JpaRepository<ExamList,Long> {

}
