package com.example.pc_club_spring_data.services;

import com.example.pc_club_spring_data.models.Employee;

public interface EmployeeService {
    void add(Employee employee);

    void deleteById(Integer id);

}
