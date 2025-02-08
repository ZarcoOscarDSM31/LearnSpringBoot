package com.learnSpring.learnSpring;

import com.learnSpring.learnSpring.Data.Entity.Student;
import com.learnSpring.learnSpring.Data.Repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnSpringApplicationTests {

	@Autowired
	private StudentRepository studentRepository;


	@Test
	void contextLoads() {
		Student oStudent = new Student("Daniel", "Martinez", 20, "daniel@example.com", "1234");
		studentRepository.save(oStudent);
	}

}
