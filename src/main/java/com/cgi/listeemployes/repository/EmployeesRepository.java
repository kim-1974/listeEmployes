package com.cgi.listeemployes.repository;


import org.springframework.data.repository.CrudRepository;

import com.cgi.listeemployes.model.Employee;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EmployeesRepository extends CrudRepository<Employee, Integer> {

}