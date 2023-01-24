package com.explicit.schoolmanagementsystem;

import com.explicit.schoolmanagementsystem.entity.student;
import com.explicit.schoolmanagementsystem.repsitory.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementSystemApplication.class, args);
	}
    @Autowired(required = false)
    private studentRepository StudentRepository;
    @Override
    public void run(String... args) throws Exception {
//        student student1 = new student ("Dave", "David", "david@gmail.com");
//        StudentRepository.save ( student1 );
//
//
//        student student2 = new student ("Mickey", "Jame", "mickey@gmail.com");
//        StudentRepository.save ( student2 );
//
//
//        student student3 = new student ("Faith", "sam", "faith@gmail.com");
//        StudentRepository.save ( student3 );
//
//
//        student student4 = new student ("Kimi", "Gim", "kim@gmail.com");
//        StudentRepository.save ( student4 );
    }
}
