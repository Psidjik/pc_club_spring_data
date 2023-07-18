package com.example.pc_club_spring_data.services;

import com.example.pc_club_spring_data.models.Subscription;

public interface SubscriptionService {
    void add(Subscription subscription);
    void deleteById(Integer id);
}
