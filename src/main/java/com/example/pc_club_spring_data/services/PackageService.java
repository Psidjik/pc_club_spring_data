package com.example.pc_club_spring_data.services;

import com.example.pc_club_spring_data.models.Package;

public interface PackageService {
    void add(Package packages);
    void deleteById(Integer id);
}
