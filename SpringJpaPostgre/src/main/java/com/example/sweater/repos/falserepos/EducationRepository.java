package com.example.sweater.repos.falserepos;

import com.example.sweater.domain.falsedomain.AvarageMark;
import com.example.sweater.domain.falsedomain.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education,Long> {

}
