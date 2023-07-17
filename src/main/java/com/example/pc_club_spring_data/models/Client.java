package com.example.pc_club_spring_data.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "clients")
public class Client extends BaseEntity{
    //    Поля ******************************************************
    @Column(name = "account_score")
    private int accountScore;

    //  Связи с другими таблицами **************************************

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "human_id", referencedColumnName = "id", nullable=false)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Human humanInfo;

    @OneToMany(mappedBy = "client")
    private List<Subscription> subscriptions;

    public Client() {
    }

    public Client(int accountScore) {
        this.accountScore = accountScore;
    }

    //    public void addSubscriptionClient(Client client){
//        if (subscriptions == null){
//            subscriptions = new List<>();
//        }
//        subscriptions.add(client);
//        client.setSubscriptions(this);
//    }

    public int getAccountScore() {
        return accountScore;
    }

    public void setAccountScore(int accountScore) {
        this.accountScore = accountScore;
    }

    public Human getHumanInfo() {
        return humanInfo;
    }
    public void setHumanInfo(Human humanInfo) {
        this.humanInfo = humanInfo;
    }

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
                ", humanInfo=" + humanInfo +
                ", subscriptions=" + subscriptions +
                ", id=" + id +
                '}';
    }
}
