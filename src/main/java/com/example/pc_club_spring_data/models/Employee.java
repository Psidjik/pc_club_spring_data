package com.example.pc_club_spring_data.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee extends Human {

    //    Поля *********************************************************
    private final static String type = "employee";
    @Column(name = "contract_number")
    private String contractNumber;
    @Column(name = "position")
    private String position;

    //  Связи с другими таблицами **************************************
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "human_id", referencedColumnName = "human_id")
//    private Human humanInfo;

    @OneToMany(mappedBy = "employee")
    private List<Subscription> subscriptions;


    public Employee() {
    }

//    public Employee(String contractNumber, String position) {
//        this.contractNumber = contractNumber;
//        this.position = position;
//    }

    public Employee(String name, String surname, String otchestvo, String phoneNumber, String email, int age, String contractNumber, String position) {
        super(name, surname, otchestvo, phoneNumber, email, age, type);
        this.contractNumber = contractNumber;
        this.position = position;
    }

//    public Employee(String name, String surname, String otchestvo, String phoneNumber, String email, int age,  String contractNumber, String position, Human humanInfo) {
//        super(name, surname, otchestvo, phoneNumber, email, age, type);
//        this.contractNumber = contractNumber;
//        this.position = position;
//        this.humanInfo = humanInfo;
//    }

    public void addSubscriptionToEmployee(Subscription subscription){
        if (subscriptions == null){
            subscriptions = new ArrayList<>();
        }
        subscriptions.add(subscription);
        subscription.setEmployee(this);
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
        return "Employee{" +
                "contractNumber='" + contractNumber + '\'' +
                ", position='" + position + '\'' +
//                ", humanInfo=" + humanInfo +
                ", subscriptions=" + subscriptions +
//                ", id=" + id +
                '}';
    }
}
