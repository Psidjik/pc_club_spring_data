package com.example.pc_club_spring_data.controllers.Human_C;

class StudentNotFoundException extends RuntimeException {
    StudentNotFoundException(Integer id) {
        super("Could not find student " + id);
    }
}