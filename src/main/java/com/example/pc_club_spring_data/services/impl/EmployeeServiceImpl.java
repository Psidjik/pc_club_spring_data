package com.example.pc_club_spring_data.services.impl;

import com.example.pc_club_spring_data.models.Employee;
import com.example.pc_club_spring_data.repositories.EmployeeRepositories;
import com.example.pc_club_spring_data.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepositories employeeRepositories;

    @Override
    public void add(Employee employee){
        employeeRepositories.save(employee);
    }
    @Override
    public void deleteById(Integer id) {
        employeeRepositories.deleteById(id);
    }

}
