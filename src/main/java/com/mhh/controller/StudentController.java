package com.mhh.controller;

import com.mhh.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping("/showStudentForm")
    public String showForm(Model module) {
        Student student = new Student();
        module.addAttribute("student", student);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student student) {
        System.out.println("the student is " + student.getFirstName() + " / " + student.getLastName());
        return "student-confirmation";
    }
}
