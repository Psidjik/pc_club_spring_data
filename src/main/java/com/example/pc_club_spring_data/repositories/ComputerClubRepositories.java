package com.example.pc_club_spring_data.repositories;



import com.example.pc_club_spring_data.models.ComputerClub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerClubRepositories extends JpaRepository<ComputerClub, Integer> {
}
