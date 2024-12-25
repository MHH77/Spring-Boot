package com.mhh.controller;

import com.mhh.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping("/showForm")
    public String showForm(Model module) {
        Student student = new Student();
        module.addAttribute("student", student);
        return "student-Form";
    }
}
