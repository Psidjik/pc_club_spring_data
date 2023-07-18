package com.example.pc_club_spring_data.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
@Table(name = "computer_clubs")
public class ComputerClub {

    //    Поля ******************************************************
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "computerClub_id")
    protected int computerClub_id;
    @Column(name = "region")
    private String region;
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;
    @Column(name = "building")
    private int building;
    @Column(name = "job_status")
    private String jobStatus;
    @Column(name = "office_number")
    private int officeNumber;

    //  Связи с другими таблицами **************************************

    @OneToMany(mappedBy = "computerClub")
    private List<Computer> computers;

    @OneToMany(mappedBy = "computerClub")
    private List<Subscription> subscriptions;

    public ComputerClub() {
    }

    public ComputerClub(String roomRentalAgreementNumber, String region, String city, String street, int building, String jobStatus, int officeNumber) {

        this.region = region;
        this.city = city;
        this.street = street;
        this.building = building;
        this.jobStatus = jobStatus;
        this.officeNumber = officeNumber;

    }
    public void addComputerToComputerClub(Computer computer){
        if(computers == null){
            computers = new ArrayList<>();
        }
        computers.add(computer);
        computer.setComputerClub(this);
    }
    public void addSubscriptionToComputerClub(Subscription subscription){
        if(subscriptions == null){
            subscriptions = new ArrayList<>();
        }
        subscriptions.add(subscription);
        subscription.setComputerClub(this);
    }
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public String toString() {
        return "ComputerClub{" +
                "region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                ", jobStatus='" + jobStatus + '\'' +
                ", officeNumber=" + officeNumber +
                ", computers=" + computers +
                ", subscriptions=" + subscriptions +
                ", id=" + computerClub_id +
                '}';
    }
}
