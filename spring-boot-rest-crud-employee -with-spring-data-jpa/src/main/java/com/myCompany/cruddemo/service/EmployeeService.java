package com.myCompany.cruddemo.service;

import com.myCompany.cruddemo.entity.Employee;
import com.myCompany.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}


