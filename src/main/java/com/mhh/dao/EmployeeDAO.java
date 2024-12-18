package com.mhh.dao;

import com.mhh.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "members")
public interface EmployeeDAO extends JpaRepository<Employee, Long> {
}
