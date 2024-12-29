package com.mhh.controller;

import com.mhh.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @GetMapping("/showStudentForm")
    public String showForm(Model module) {
        Student student = new Student();
        module.addAttribute("student", student);
        module.addAttribute("countries", countries);
        // add the list of languages to the model
        module.addAttribute("languages", languages);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student student) {
        System.out.println("the student is " + student.getFirstName() + " / " + student.getLastName());
        return "student-confirmation";
    }
}
