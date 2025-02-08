package com.learnSpring.learnSpring.repository;

import com.learnSpring.learnSpring.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
