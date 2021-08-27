package com.cgi.listeemployes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.listeemployes.model.Employee;
import com.cgi.listeemployes.repository.EmployeesRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeesRepository employeesRepository;

    public Optional<Employee> getEmployee(final int id) {
        return employeesRepository.findById(id);
    }

    public Iterable<Employee> getEmployees() {
        return employeesRepository.findAll();
    }
    
    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = employeesRepository.save(employee);
        return savedEmployee;
    }
    
   public void deleteEmployee(final int id) {
        employeesRepository.deleteById(id);
    }



}