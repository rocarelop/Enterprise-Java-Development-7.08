package com.ironhack.lab708.controller.interfaces;

import com.ironhack.lab708.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeController{
public Employee findById(Long id);
public List<Employee> findAll();
public void delete(Long id);
}
