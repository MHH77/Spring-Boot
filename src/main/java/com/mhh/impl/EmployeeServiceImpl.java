package com.mhh.impl;

import com.mhh.dao.EmployeeDAO;
import com.mhh.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements com.mhh.sevice.EmployeeService {

    private final EmployeeDAO employeeDAO;

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }


}
