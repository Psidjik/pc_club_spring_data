package com.example.pc_club_spring_data.services;

import com.example.pc_club_spring_data.models.Client;

public interface ClientService<ID> {
    void add(Client client);
    void deleteById(Integer id);
}
