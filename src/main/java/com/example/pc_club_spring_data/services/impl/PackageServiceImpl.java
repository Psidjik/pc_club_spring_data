package com.example.pc_club_spring_data.services.impl;

import com.example.pc_club_spring_data.repositories.PackageRepositories;
import com.example.pc_club_spring_data.services.PackageService;
import com.example.pc_club_spring_data.models.Package;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackageServiceImpl implements PackageService {
    @Autowired
    PackageRepositories packageRepositories;

    public void add(Package packages){
        packageRepositories.save(packages);
    }
    public void deleteById(Integer id){
        packageRepositories.deleteById(id);
    }
}
