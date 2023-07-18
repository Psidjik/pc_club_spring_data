package com.example.pc_club_spring_data.services.impl;

import com.example.pc_club_spring_data.models.Computer;
import com.example.pc_club_spring_data.models.ComputerClub;
import com.example.pc_club_spring_data.repositories.ComputerClubRepositories;
import com.example.pc_club_spring_data.repositories.ComputerRepositories;
import com.example.pc_club_spring_data.services.ComputerClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerClubServiceImpl implements ComputerClubService {
    @Autowired
    ComputerClubRepositories computerClubRepositories;
    public void add(ComputerClub computerClub){

        computerClubRepositories.save(computerClub);
    }
    public void deleteById(Integer id){
        computerClubRepositories.deleteById(id);
    }
}
