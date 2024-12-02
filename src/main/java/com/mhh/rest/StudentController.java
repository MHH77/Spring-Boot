package com.mhh.rest;


import com.mhh.entity.Student;
import com.mhh.exceptions.StudentErrorResponse;
import com.mhh.exceptions.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        if (studentId <= 0 ||  studentId > students.size()) {
            throw new StudentNotFoundException("student id " + studentId + " not found");
        }
        return students.get(studentId);
    }


    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e) {
        StudentErrorResponse errorResponse = new StudentErrorResponse();
        errorResponse.setMessage(e.getMessage());
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }


}
