package com.example.pc_club_spring_data.repositories;



import com.example.pc_club_spring_data.models.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepositories extends JpaRepository<Computer, Integer> {
}
