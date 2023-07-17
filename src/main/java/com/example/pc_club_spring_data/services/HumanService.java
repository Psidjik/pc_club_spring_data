package com.example.pc_club_spring_data.services;

//import com.example.pc_club_spring_data.dtos.FullHumanDto;
import com.example.pc_club_spring_data.models.Human;

import java.util.List;
import java.util.Optional;

public interface HumanService<ID> {

    void add(Human human);
    void deleteById(Integer id);
//    FullHumanDto register(FullHumanDto fullHumanDto);
//
//    void expel(FullHumanDto student);
//
//    void expel(ID id);
//
//    void transfer(StudentDto student, GroupDto group);
//
//    Optional<StudentDto> findStudent(ID id);
//
//    List<Human> getAll();

//    List<StudentDto> findStudentsByGroup(String group);
}
