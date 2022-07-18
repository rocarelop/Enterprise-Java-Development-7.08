package com.ironhack.lab708.controller.impl;

import com.ironhack.lab708.Repository.EmployeeRepository;
import com.ironhack.lab708.controller.interfaces.EmployeeController;
import com.ironhack.lab708.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeControllerImpl implements EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("/employees/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee findById(@PathVariable Long id) {
        return employeeRepository.findById(id).get();
    }

    @GetMapping("/employees")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @DeleteMapping("/employees/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }
}





