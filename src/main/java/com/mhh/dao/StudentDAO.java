package com.mhh.dao;


import com.mhh.Entity.Student;

import java.util.List;

public interface StudentDAO {

    public void save(Student student);

    public Student findById(int id);

    public List<Student> findAll();

    public List<Student> findByName(String lastName);

}
