package com.example.pc_club_spring_data.repositories;



import com.example.pc_club_spring_data.models.Human;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumanRepositories extends JpaRepository<Human, Integer> {
}
