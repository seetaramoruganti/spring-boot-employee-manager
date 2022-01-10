package com.ford.employeemanager.service;

import java.util.List;

import com.ford.employeemanager.model.Employee;
import com.ford.employeemanager.repo.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee saveEmployeetoDb(Employee employee){
        return employeeRepo.save(employee);
    } 

    public Employee getEmployeeById(int id){
        return employeeRepo.getById(id);
    }

    public String deleteEmployeeById(int id) {
        String msg = "Employee Deleted Successfully !";

        try {
            employeeRepo.deleteById(id);
            
        } catch (Exception e) {
            msg = "unable to delete Employee check whether ID is available in DB, or pass the Idin correct format";
        }
        return msg;
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
}
