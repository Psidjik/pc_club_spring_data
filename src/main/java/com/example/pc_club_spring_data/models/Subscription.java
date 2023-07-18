package com.example.pc_club_spring_data.models;

import jakarta.persistence.*;

@Entity
@Table(name = "subscriptions")
public class Subscription extends BaseEntity {

//    Поля ******************************************************
    @Column(name = "unique_subscription_number")
    private String uniqueSubscriptionNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "package_id",referencedColumnName = "package_id")
    private Package packageType;

//    @Column(name = "validity_period")
//    private String validityPeriod;
    @Column(name = "registration_date")
    private String registrationDate;
//    @Column(name = "status")
//    private String status;


//  Связи с другими таблицами **************************************

//    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.REMOVE})
//    @JoinColumn(name = "computer_id")
//    private Computer computer;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.REMOVE})
    @JoinColumn(name = "comp_club_id")
    private ComputerClub computerClub;


    public Subscription() {
    }

    public Subscription(String uniqueSubscriptionNumber, String registrationDate) {
        this.uniqueSubscriptionNumber = uniqueSubscriptionNumber;
        this.registrationDate = registrationDate;

    }

    public String getUniqueSubscriptionNumber() {
        return uniqueSubscriptionNumber;
    }

    public void setUniqueSubscriptionNumber(String uniqueSubscriptionNumber) {
        this.uniqueSubscriptionNumber = uniqueSubscriptionNumber;
    }

    public Package getPackageType() {
        return packageType;
    }

    public void setPackageType(Package packageType) {
        this.packageType = packageType;
    }

    public ComputerClub getComputerClub() {
        return computerClub;
    }

    public void setComputerClub(ComputerClub computerClub) {
        this.computerClub = computerClub;
    }

    //    public String getValidityPeriod() {
//        return validityPeriod;
//    }
//
//    public void setValidityPeriod(String validityPeriod) {
//        this.validityPeriod = validityPeriod;
//    }
//
    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

//    public ComputerClub getComputerClub() {
//        return computerClub;
//    }
//
//    public void setComputerClub(ComputerClub computerClub) {
//        this.computerClub = computerClub;
//    }

}
