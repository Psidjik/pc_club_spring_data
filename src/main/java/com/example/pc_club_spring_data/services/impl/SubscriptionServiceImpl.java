package com.example.pc_club_spring_data.services.impl;

import com.example.pc_club_spring_data.models.Subscription;
import com.example.pc_club_spring_data.repositories.SubscriptionRepositories;
import com.example.pc_club_spring_data.services.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Autowired
    SubscriptionRepositories subscriptionRepositories;

    public void add(Subscription subscription){
        subscriptionRepositories.save(subscription);
    }
    public void deleteById(Integer id){
        subscriptionRepositories.deleteById(id);
    }
}
