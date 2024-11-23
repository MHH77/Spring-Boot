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
            readStudent(studentDAO);
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

    private void readStudent(StudentDAO studentDAO) {
        // create the student object
        System.out.println("creating new student object .... ");
        Student student = new Student("alimohammad", "mohammadi", "b.m@example.com");

        // save the student
        System.out.println("Saving the student ...." + student);
        studentDAO.save(student);

        // display id of the saved student
        int id = student.getId();
        System.out.println("Saved student successfully... id is :" + student.getId());

        // retrieve student based on id : primary key
        System.out.println("Reading the student by id :" + id);
        Student byId = studentDAO.findById(id);

        // display student
        System.out.println("Reading student by id successfully... id is :" + byId);

    }


}
