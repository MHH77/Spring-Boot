package com.mhh.service;

import com.mhh.model.Student;
import com.mhh.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student insertStudent(Student student) {
        return studentRepository.save(student);
    }
}
