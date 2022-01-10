package com.ford.employeemanager.controller;

import java.util.List;

import com.ford.employeemanager.model.Employee;
import com.ford.employeemanager.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    @CrossOrigin("http://localhost:4200")
    public List<Employee> fetchEmployeeList(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/addEmployee")
    @CrossOrigin("http://localhost:4200")
    public Employee saveEmployee(@RequestBody Employee employee ){
        return employeeService.saveEmployeetoDb(employee);
    }

    @GetMapping("/getEmployeeById/{id}")
    @CrossOrigin("http://localhost:4200")
    public Employee fetchById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/deleteEmployeeById/{id}")
    @CrossOrigin("http://localhost:4200")
    public String deleteById(@PathVariable int id){
        return employeeService.deleteEmployeeById(id);

    }

    @PutMapping("/update")
    @CrossOrigin("http://localhost:4200")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
    
}
