package com.youtubeproject.sms;

import com.youtubeproject.sms.entity.Student;
import com.youtubeproject.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagementProjectApplication.class, args);


	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Amina", "Ismayilzada", "amina@gmail.com");
//		studentRepository.save(student1);

	}
}
