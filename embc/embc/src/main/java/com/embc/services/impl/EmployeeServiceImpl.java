package com.embc.services.impl;

import com.embc.entities.Employee;
import com.embc.repositories.EmployeeRepository;
import com.embc.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(String employee) {
        Employee employee = new Employee();
        employee.setId();
        employee.setFirstName();
        employee.setLastName();
        employee.setEmail();
        return employee;
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee updateEmployee(int id, String employee) {
        return null;
    }

    @Override
    public void deleteEmployee(int id) {

    }
}
