package com.example.pc_club_spring_data.services;

import com.example.pc_club_spring_data.models.Computer;

public interface ComputerService {
    void add(Computer computer);
    void deleteById(Integer id);
}
