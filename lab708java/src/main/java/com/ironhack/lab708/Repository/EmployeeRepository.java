package com.ironhack.lab708.Repository;

import com.ironhack.lab708.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

