package com.mhh;

import com.mhh.Entity.Student;
import com.mhh.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return args -> {
            createStudent(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        // create the student object
        System.out.println("creating new student object .... ");
        Student student = new Student("ali", "mohammadi", "A.m@example.com");

        // save the student
        System.out.println("Saving the student ....");
        studentDAO.save(student);

        // display id of the saved student
        System.out.println("Saved student successfully... id is :" + student.getId());


    }


}
