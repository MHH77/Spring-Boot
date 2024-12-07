package com.mhh.rest;


import com.mhh.entity.Student;
import com.mhh.exceptions.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("ali", "mohammadi"));
        students.add(new Student("naser", "Hejazii"));
        students.add(new Student("layla", "ghomii"));
        students.add(new Student("reza", "shiri"));

    }


    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }


    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if (studentId <= 0 || studentId > students.size()) {
            throw new StudentNotFoundException("student id " + studentId + " not found");
        }
        return students.get(studentId);
    }

}
