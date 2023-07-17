package com.example.pc_club_spring_data.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "computers")
public class Computer extends BaseEntity{

    //    Поля ******************************************************
    @Column(name = "serial_number")
    private String serialNumber;
    @Column(name = "processor_model")
    private String processorModel;
    @Column(name = "ram_capacity")
    private String ramCapacity;
    @Column(name = "video_card_model")
    private String videoCardModel;
    @Column(name = "hard_disk_capacity")
    private String hardDiskCapacity;
    @Column(name = "status")
    private String status;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "computer_package", joinColumns = @JoinColumn(name = "computer_id")
    , inverseJoinColumns = @JoinColumn(name = "package_id"))
    private List<Package> packages;

    //  Связи с другими таблицами **************************************
//    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.REMOVE}
//            ,mappedBy = "computer")
//    private Subscription subscription;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.REMOVE})
    @JoinColumn(name = "comp_club_id",referencedColumnName = "id", nullable=false)
    private ComputerClub computerClub;

    public Computer() {
    }

    public Computer(String serialNumber, String processorModel, String ramCapacity, String videoCardModel, String hardDiskCapacity, String status) {
        this.serialNumber = serialNumber;
        this.processorModel = processorModel;
        this.ramCapacity = ramCapacity;
        this.videoCardModel = videoCardModel;
        this.hardDiskCapacity = hardDiskCapacity;
        this.status = status;
    }

    public void addPackagesToComputer(Package packag){
        if(packages == null){
            packages = new ArrayList<>();
        }
        packages.add(packag);
    }
    public List<Package> getPackages() {
        return packages;
    }

    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public String getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(String ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public String getVideoCardModel() {
        return videoCardModel;
    }

    public void setVideoCardModel(String videoCardModel) {
        this.videoCardModel = videoCardModel;
    }

    public String getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(String hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


//    public Subscription getSubscription() {
//        return subscription;
//    }
//
//    public void setSubscription(Subscription subscription) {
//        this.subscription = subscription;
//    }

    public ComputerClub getComputerClub() {
        return computerClub;
    }

    public void setComputerClub(ComputerClub computerClub) {
        this.computerClub = computerClub;
    }

//    @Override
//    public String toString() {
//        return "Computer{" +
//                "computerId=" + computerId +
//                ", serialNumber='" + serialNumber + '\'' +
//                ", processorModel='" + processorModel + '\'' +
//                ", ramCapacity='" + ramCapacity + '\'' +
//                ", videoCardModel='" + videoCardModel + '\'' +
//                ", hardDiskCapacity='" + hardDiskCapacity + '\'' +
//                ", status='" + status + '\'' +
//                ", subscription=" + subscription +
//                ", computerClub=" + computerClub +
//                '}';
//    }
}
