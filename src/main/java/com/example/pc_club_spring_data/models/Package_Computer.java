package com.example.pc_club_spring_data.models;

import jakarta.persistence.*;

@Entity(name = "Package_Computer")
public class Package_Computer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "package_id", referencedColumnName = "package_id")
    private Package packages;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "computer_id", referencedColumnName = "computer_id")
    private Computer computer;

    public Package_Computer() {
    }

    public Package_Computer(Integer id, Package packages, Computer computer) {
        this.id = id;
        this.packages = packages;
        this.computer = computer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Package getPackages() {
        return packages;
    }

    public void setPackages(Package packages) {
        this.packages = packages;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
