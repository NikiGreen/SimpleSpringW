package com.example.sweater.repos.falserepos;

import com.example.sweater.domain.Student;
import com.example.sweater.domain.falsedomain.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvarageMarkRepository extends JpaRepository<AvarageMark,Long> {

}
