package com.example.pc_club_spring_data.services;

import com.example.pc_club_spring_data.models.ComputerClub;

public interface ComputerClubService {
    void add(ComputerClub computerClub);
    void deleteById(Integer id);
}
