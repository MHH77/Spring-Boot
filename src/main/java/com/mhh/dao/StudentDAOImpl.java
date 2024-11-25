package com.mhh.dao;


import com.mhh.Entity.Student;
import jakarta.persistence.EntityManager;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
public class StudentDAOImpl implements StudentDAO {

    private final EntityManager entityManager;

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("from Student order by id desc", Student.class).getResultList();
    }

    @Override
    public List<Student> findByName(String lastName) {
        return entityManager.createQuery("from Student where lastName=: lastName", Student.class).setParameter("lastName", lastName).getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }
}
