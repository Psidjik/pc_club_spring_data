package com.example.pc_club_spring_data.services.impl;

import com.example.pc_club_spring_data.models.Human;
import com.example.pc_club_spring_data.repositories.HumanRepositories;
import com.example.pc_club_spring_data.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

@Service
public class HumanServiceImpl implements HumanService {

    @Autowired
    HumanRepositories humanRepositories;

    @Override
    public void add(Human human){
        humanRepositories.save(human);
    }

}
