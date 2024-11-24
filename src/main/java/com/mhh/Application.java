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
            fetchStudentByLastname(studentDAO);
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

    private void readAllStudent(StudentDAO studentDAO) {

        System.out.println("reading all student objects .... ");

        for (Student student : studentDAO.findAll()) {
            System.out.println(student);
        }

    }

    private void fetchStudentByLastname(StudentDAO studentDAO) {

        System.out.println("reading student objects by lastname .... ");

        for (Student student : studentDAO.findByName("mohammadi")) {
            System.out.println(student);
        }

    }


}
