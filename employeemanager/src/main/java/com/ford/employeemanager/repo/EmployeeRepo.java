package com.ford.employeemanager.repo;

import com.ford.employeemanager.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
}
