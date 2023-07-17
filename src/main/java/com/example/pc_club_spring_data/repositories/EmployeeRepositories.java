package com.example.pc_club_spring_data.repositories;



import com.example.pc_club_spring_data.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositories extends JpaRepository<Employee, Integer> {
}
