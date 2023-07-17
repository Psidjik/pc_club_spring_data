package com.example.pc_club_spring_data.services.init;


import com.example.pc_club_spring_data.models.Client;
import com.example.pc_club_spring_data.models.Employee;
import com.example.pc_club_spring_data.models.Human;
import com.example.pc_club_spring_data.services.ClientService;
import com.example.pc_club_spring_data.services.EmployeeService;
import com.example.pc_club_spring_data.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
        @Autowired
        private HumanService humanService;
        @Autowired
        private ClientService clientService;
        @Autowired
        private EmployeeService employeeService;

        @Override
        public void run(String... args) throws  Exception{
            seedData();
        }

        private void seedData() throws IOException{

//            Human human = new Human("Ivan","Ivanov", "Ivanovich","89109997777", "ivan@yandex.ru", 26 );
//            Human human1 = new Human("Ivan1","Ivan1ov", "Iv1anovich","89109197777", "an@yandex.ru", 24 );
//            Human human2 = new Human("Ivan2","Ivano1v", "Ivanov0ich","8910997777", "ian@yandex.ru", 25 );
            Client client1 = new Client("Ivan2","Ivano1v", "Ivanov0ich","8910997777", "ian@yandex.ru", 25, 123456);
            Client client2 = new Client("Ivan2","Iano1v", "Ivanov0ich","8910997777", "ian@yandex.ru", 15, 123444);
            Employee employee = new Employee("Ivan2","Iano1v", "Ivanov0ich","8910997777", "ian@yandex.ru", 15, "123", "Cleaner");
            Employee employee1 = new Employee("Ivan2","Iano1v", "Ivanov0ich","8910997777", "ian@yandex.ru", 15, "345", "Admin");
//            Client client = new Client(13445);
//            Employee employee = new Employee("12344", "Кассир");

            clientService.add(client1);
            clientService.add(client2);
            employeeService.add(employee);
            employeeService.add(employee1);

//            humanService.deleteById(1);

        }

    }






////    @Autowired
////    private HumanService humanService;
//
//    @Override
//    public void run(String... args) throws Exception {
//        seedData();
//    }
//
//    private void printAllStudentsByGroupName(String groupName) {
//        studentService
//                .findStudentsByGroup(groupName)
//                .forEach(System.out::println);
//    }
//
//    private void seedData() throws IOException {
//        //Добавление в БД записей
//        GroupDto g1 = new GroupDto(0,"UVP-211");
//        GroupDto g2 = new GroupDto(0,"UVP-212");
//
//        StudentDto s1 = new StudentDto(0, "Petr Ivanov", g1);
//        StudentDto s2 = new StudentDto(0, "Ivan Petrov", g2);
//
//        s1 = studentService.register(s1);
//        s2 = studentService.register(s2);
//
//        printAllStudentsByGroupName("UVP-212");
//
//        studentService.transfer(s1, s2.getGroup());
//
//        printAllStudentsByGroupName("UVP-212");
//    }

