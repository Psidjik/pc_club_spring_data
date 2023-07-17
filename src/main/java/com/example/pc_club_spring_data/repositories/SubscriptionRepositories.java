package com.example.pc_club_spring_data.repositories;



import com.example.pc_club_spring_data.models.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepositories extends JpaRepository<Subscription, Integer> {
}
