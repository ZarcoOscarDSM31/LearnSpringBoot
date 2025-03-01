package com.learnSpring.learnSpring;

import com.learnSpring.learnSpring.Data.Entity.Administrativo;
import com.learnSpring.learnSpring.Data.Entity.Alumno;
import com.learnSpring.learnSpring.Data.Repository.AdministrativoRepository;
import com.learnSpring.learnSpring.Data.Repository.AlumnoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InheritanceTest {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private AdministrativoRepository administrativoRepository;

    @Test
    void testInsertAlumnoAndAdministrativo() {

        Alumno oAlumno = new Alumno();
        oAlumno.setName("Diego");
        oAlumno.setLastname("Garcia");
        oAlumno.setEmail("diego@gmail.com");
        alumnoRepository.save(oAlumno);


        Administrativo oAdministrativo;
        oAdministrativo = new Administrativo();
        oAdministrativo.setName("Juan");
        oAdministrativo.setLastname("Perez");
        oAdministrativo.setEmail("juan@gmail.com");
        oAdministrativo.setSalary(1000.0);
        administrativoRepository.save(oAdministrativo);

    }
}