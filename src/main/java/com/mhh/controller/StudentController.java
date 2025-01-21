package com.mhh.controller;

import com.mhh.model.Membership;
import com.mhh.model.Student;
import com.mhh.service.MembershipService;
import com.mhh.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;
    private final MembershipService membershipService;

    @PostMapping("/create")
    public Student processStudentForm() {
        Membership membership = new Membership();
        membership.setFirstName("aliii");
        membership.setLastName("hhh");
        membership.setCountry("USA");
        Student student = new Student();
        student.setFirstName("aliii");
        student.setLastName("hhh");
        student.setCountry("USA");
        membershipService.addStudent(membership);
        return studentService.addStudent(student);

    }
}
