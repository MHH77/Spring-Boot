package com.mhh.dao;

import com.mhh.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeDAO extends JpaRepository<Employee, Long> {
}
