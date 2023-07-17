package com.example.pc_club_spring_data.services.impl;

import com.example.pc_club_spring_data.models.Client;
import com.example.pc_club_spring_data.models.Human;
import com.example.pc_club_spring_data.repositories.ClientRepositories;
import com.example.pc_club_spring_data.repositories.HumanRepositories;
import com.example.pc_club_spring_data.services.ClientService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepositories clientRepositories;

    @Override
    public void add(Client client){
        clientRepositories.save(client);
    }

    @Override
    public void deleteById(Integer id) {
        clientRepositories.deleteById(id);
    }



}
