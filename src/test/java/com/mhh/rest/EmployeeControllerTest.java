package com.mhh.rest;

import com.mhh.entity.Employee;
import com.mhh.sevice.EmployeeService;
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
public class EmployeeControllerTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeController employeeController;

    @Test
    public void testGetAllEmployees() {
        List<Employee> mockEmployees = Arrays.asList(
                createMockEmployee(1L, "John", "Doe", "john.doe@example.com"),
                createMockEmployee(2L, "Jane", "Smith", "jane.smith@example.com")
        );

        when(employeeService.findAll()).thenReturn(mockEmployees);

        List<Employee> result = employeeController.getAllEmployees();

        assertNotNull(result);
        assertEquals(2, result.size());
        verify(employeeService, times(1)).findAll();
    }

    @Test
    public void testSaveEmployee() {
        Employee mockEmployee = createMockEmployee(1L, "John", "Doe", "john.doe@example.com");
        when(employeeService.save(mockEmployee)).thenReturn(mockEmployee);

        Employee result = employeeController.saveEmployee(mockEmployee);

        assertNotNull(result);
        assertEquals("John", result.getFirstName());
        verify(employeeService, times(1)).save(mockEmployee);
    }

    @Test
    public void testGetEmployeeById() {
        Employee mockEmployee = createMockEmployee(1L, "John", "Doe", "john.doe@example.com");
        when(employeeService.findById(1L)).thenReturn(Optional.of(mockEmployee));

        Optional<Employee> result = employeeController.getEmployeeById(1L);

        assertTrue(result.isPresent());
        assertEquals("John", result.get().getFirstName());
        verify(employeeService, times(1)).findById(1L);
    }

    @Test
    public void testDeleteEmployeeById() {
        doNothing().when(employeeService).deleteById(1L);

        employeeController.deleteEmployeeById(1L);

        verify(employeeService, times(1)).deleteById(1L);
    }

    @Test
    public void testUpdateEmployee() {
        Employee mockEmployee = createMockEmployee(1L, "John", "Doe", "john.doe@example.com");
        when(employeeService.update(mockEmployee)).thenReturn(mockEmployee);

        Employee result = employeeController.updateEmployee(mockEmployee);

        assertNotNull(result);
        assertEquals("John", result.getFirstName());
        verify(employeeService, times(1)).update(mockEmployee);
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
