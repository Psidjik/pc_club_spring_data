package com.example.pc_club_spring_data.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "package")
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "package_id")
    private int packageId;

    @Column(name = "type")
    private String typePackage;

    @Column(name = "cost")
    private int cost;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "computer_package", joinColumns = @JoinColumn(name = "package_id")
            , inverseJoinColumns = @JoinColumn(name = "computer_id"))
    private List<Computer> computers;

    public Package(String typePackage, int cost) {
        this.typePackage = typePackage;
        this.cost = cost;
    }

    public Package() {
    }

    public void addComputerToPackage(Computer computer){
        if(computers == null)
            computers = new ArrayList<>();
        computers.add(computer);
    }

    public int getPackageId() {
        return packageId;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public String getTypePackage() {
        return typePackage;
    }

    public void setTypePackage(String typePackage) {
        this.typePackage = typePackage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageId=" + packageId +
                ", typePackage='" + typePackage + '\'' +
                ", cost=" + cost +
                '}';
    }
}
