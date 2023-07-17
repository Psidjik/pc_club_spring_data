package com.example.pc_club_spring_data.controllers;

class StudentNotFoundException extends RuntimeException {
    StudentNotFoundException(Integer id) {
        super("Could not find student " + id);
    }
}