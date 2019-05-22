package com.example.sweater.repos.falserepos;

import com.example.sweater.domain.falsedomain.AvarageMark;
import com.example.sweater.domain.falsedomain.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineRepository extends JpaRepository<Discipline,Long> {

}
