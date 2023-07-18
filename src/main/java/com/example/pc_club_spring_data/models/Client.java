package com.example.pc_club_spring_data.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client extends Human{
    //    Поля ******************************************************
    private final static String type = "client";
    @Column(name = "account_score")
    private int accountScore;

    //  Связи с другими таблицами **************************************

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "human_id", referencedColumnName = "human_id")
//    private Human humanInfo;

    @OneToMany(mappedBy = "client")
    private List<Subscription> subscriptions;

    public Client() {
    }

    public Client(String name, String surname, String otchestvo, String phoneNumber, String email, int age, int accountScore) {
        super(name, surname, otchestvo, phoneNumber, email, age, type);
        this.accountScore = accountScore;
    }

        public void addSubscriptionToClient(Subscription subscription){
        if (subscriptions == null){
            subscriptions = new ArrayList<>();
        }
        subscriptions.add(subscription);
        subscription.setClient(this);
    }

    public int getAccountScore() {
        return accountScore;
    }

    public void setAccountScore(int accountScore) {
        this.accountScore = accountScore;
    }

//    public Human getHumanInfo() {
//        return humanInfo;
//    }
//    public void setHumanInfo(Human humanInfo) {
//        this.humanInfo = humanInfo;
//    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public String toString() {
        return "Client{" +
                "accountScore=" + accountScore +
//                ", humanInfo=" + humanInfo +
                ", subscriptions=" + subscriptions +
//                ", id=" + id +
                '}';
    }
}
