package com.mhh.service;

import com.mhh.model.Student;
import com.mhh.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public boolean addStudent(Student student) {
        return false;
    }
}
