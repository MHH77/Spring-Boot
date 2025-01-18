package com.mhh.controller;

import com.mhh.model.Student;
import com.mhh.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@AllArgsConstructor
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/create")
    public Student processStudentForm() {
        Student student = new Student();
        student.setFirstName("aliii");
        student.setLastName("hhh");
        student.setCountry("USA");
        return studentService.insertStudent(student);
    }
}
