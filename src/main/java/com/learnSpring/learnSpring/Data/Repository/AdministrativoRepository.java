package com.learnSpring.learnSpring.Data.Repository;

import com.learnSpring.learnSpring.Data.Entity.Administrativo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdministrativoRepository extends JpaRepository<Administrativo, UUID> {
}