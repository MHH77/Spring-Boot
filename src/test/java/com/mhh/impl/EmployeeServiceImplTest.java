package com.mhh.impl;

import com.mhh.dao.EmployeeDAO;
import com.mhh.entity.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {
    @Mock
    private EmployeeDAO employeeDAO;

    @InjectMocks
    private EmployeeServiceImpl employeeService;


    @Test
    public void testFindAll() {
        List<Employee> mockEmployees = Arrays.asList(
                createMockEmployee(1L, "John", "Doe", "john.doe@example.com"),
                createMockEmployee(2L, "Jane", "Smith", "jane.smith@example.com")
        );

        when(employeeDAO.findAll()).thenReturn(mockEmployees);

        List<Employee> result = employeeService.findAll();

        assertNotNull(result);
        assertEquals(2, result.size());
        verify(employeeDAO, times(1)).findAll();
    }

    @Test
    public void testFindById() {
        Employee mockEmployee = createMockEmployee(1L, "John", "Doe", "john.doe@example.com");
        when(employeeDAO.findById(1L)).thenReturn(Optional.of(mockEmployee));

        Optional<Employee> result = employeeService.findById(1L);

        assertTrue(result.isPresent());
        assertEquals("John", result.get().getFirstName());
        verify(employeeDAO, times(1)).findById(1L);
    }

    @Test
    public void testSave() {
        Employee mockEmployee = createMockEmployee(1L, "John", "Doe", "john.doe@example.com");
        when(employeeDAO.save(mockEmployee)).thenReturn(mockEmployee);

        Employee result = employeeService.save(mockEmployee);

        assertNotNull(result);
        assertEquals("John", result.getFirstName());
        verify(employeeDAO, times(1)).save(mockEmployee);
    }

    @Test
    public void testDeleteById() {
        doNothing().when(employeeDAO).deleteById(1L);

        employeeService.deleteById(1L);

        verify(employeeDAO, times(1)).deleteById(1L);
    }

    @Test
    public void testUpdate() {
        Employee mockEmployee = createMockEmployee(1L, "John", "Doe", "john.doe@example.com");
        when(employeeDAO.save(mockEmployee)).thenReturn(mockEmployee);

        Employee result = employeeService.update(mockEmployee);

        assertNotNull(result);
        assertEquals("John", result.getFirstName());
        verify(employeeDAO, times(1)).save(mockEmployee);
    }

    private Employee createMockEmployee(Long id, String firstName, String lastName, String email) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmail(email);
        return employee;
    }
}