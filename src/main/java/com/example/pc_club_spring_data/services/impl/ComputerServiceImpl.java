package com.example.pc_club_spring_data.services.impl;

import com.example.pc_club_spring_data.models.Computer;
import com.example.pc_club_spring_data.repositories.ComputerRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pc_club_spring_data.services.ComputerService;


@Service
public class ComputerServiceImpl implements ComputerService {
    @Autowired
    ComputerRepositories computerRepositories;
    public void add(Computer computer){
        computerRepositories.save(computer);
    }
    public void deleteById(Integer id){
        computerRepositories.deleteById(id);
    }
}
