package com.mhh.dao;


import com.mhh.Entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(int id);

    List<Student> findAll();

    List<Student> findByName(String lastName);

    void update(Student student);

}
