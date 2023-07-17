//package com.example.pc_club_spring_data.controllers.Human_C;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class StudentController {
//
//    @Autowired
//    private HumanService humanService;
//
//    @GetMapping("/students")
//    Iterable<StudentDto> all() {
//        return studentService.getAll();
//    }
//
//    @PostMapping("/students")
//    StudentDto newStudent(@RequestBody StudentDto newStudent) {  return studentService.register(newStudent); }
//
//    @GetMapping("/students/{id}")
//    StudentDto one(@PathVariable Integer id) throws Throwable {
//
//        return (StudentDto) studentService.findStudent(id)
//                .orElseThrow(() -> new StudentNotFoundException(id));
//    }
//
//    @DeleteMapping("/students/{id}")
//    void deleteStudent(@PathVariable Integer id) {
//        studentService.expel(id);
//    }
//}
