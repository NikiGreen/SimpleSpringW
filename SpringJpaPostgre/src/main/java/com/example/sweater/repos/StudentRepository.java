package com.example.sweater.repos;

import com.example.sweater.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByStudentNameOrderByStudentName(String studentName);
    @Transactional
    void removeAllByStudentName(String studentName);

}
