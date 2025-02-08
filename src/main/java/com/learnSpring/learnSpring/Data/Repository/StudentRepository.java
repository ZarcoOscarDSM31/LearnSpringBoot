package com.learnSpring.learnSpring.Data.Repository;

import com.learnSpring.learnSpring.Data.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
