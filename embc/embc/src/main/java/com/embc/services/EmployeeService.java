package com.embc.services;

import com.embc.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee saveEmployee(String employee);
    Optional<Employee> getEmployeeById(int id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(int id, String employee);
    void deleteEmployee(int id);
}
