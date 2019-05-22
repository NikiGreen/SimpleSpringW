package com.example.sweater.repos.falserepos;

import com.example.sweater.domain.falsedomain.AvarageMark;
import com.example.sweater.domain.falsedomain.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialtyRepository extends JpaRepository<Specialty,Long> {

}
