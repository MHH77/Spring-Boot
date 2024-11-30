package com.mhh.rest;


import com.mhh.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("ali","mohammadi"));
        students.add(new Student("naser","Hejazii"));
        students.add(new Student("layla","ghomii"));
        students.add(new Student("reza","shiri"));

        return students;
    }



}
