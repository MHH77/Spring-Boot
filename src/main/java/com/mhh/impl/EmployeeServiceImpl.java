package com.mhh.impl;

import com.mhh.dao.EmployeeDAO;
import com.mhh.entity.Employee;
import com.mhh.sevice.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDAO employeeDAO;

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeDAO.findById(id);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeDAO.deleteById(id);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeDAO.save(employee);
    }


}
