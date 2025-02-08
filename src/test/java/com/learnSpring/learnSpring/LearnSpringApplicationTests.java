package com.learnSpring.learnSpring;

import com.learnSpring.learnSpring.domain.Student;
import com.learnSpring.learnSpring.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnSpringApplicationTests {

	@Autowired
	private StudentRepository studentRepository;


	@Test
	void contextLoads() {
		Student oStudent = new Student("Oscar", "Ochoa", 25, "9N2dW@example.com", "1234");
		studentRepository.save(oStudent);
	}

}
