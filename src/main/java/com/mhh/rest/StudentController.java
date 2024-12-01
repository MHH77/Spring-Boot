package com.mhh.rest;


import com.mhh.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("ali","mohammadi"));
        students.add(new Student("naser","Hejazii"));
        students.add(new Student("layla","ghomii"));
        students.add(new Student("reza","shiri"));

    }


    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }


    @GetMapping("/students/{studentid}")
    public Student getStudent(@PathVariable int studentid) {
        return students.get(studentid);
    }




}
