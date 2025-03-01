package com.learnSpring.learnSpring.Data.Repository;

import com.learnSpring.learnSpring.Data.Entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlumnoRepository extends JpaRepository<Alumno, UUID> {
}
