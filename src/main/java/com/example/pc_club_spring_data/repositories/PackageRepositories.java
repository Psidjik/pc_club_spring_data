package com.example.pc_club_spring_data.repositories;

import com.example.pc_club_spring_data.models.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepositories extends JpaRepository<Package, Integer> {
}
