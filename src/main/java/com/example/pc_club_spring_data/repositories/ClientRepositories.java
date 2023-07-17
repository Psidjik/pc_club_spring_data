package com.example.pc_club_spring_data.repositories;


import com.example.pc_club_spring_data.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepositories extends JpaRepository<Client, Integer> {

}
