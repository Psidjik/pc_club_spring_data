package com.example.pc_club_spring_data.services.init;


import com.example.pc_club_spring_data.models.*;
import com.example.pc_club_spring_data.models.Package;
import com.example.pc_club_spring_data.services.*;
import com.example.pc_club_spring_data.services.impl.ComputerServiceImpl;
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
        @Autowired
        private ComputerService computerService;
        @Autowired
        private ComputerClubService computerClubService;
        @Autowired
        private PackageService packageService;
        @Autowired
        private SubscriptionService subscriptionService;

        @Override
        public void run(String... args) throws  Exception{
            seedData();
        }

        private void seedData() throws IOException{

            Client client1 = new Client("Ivan2","Ivano1v", "Ivanov0ich","8910997777", "ian@yandex.ru", 25, 123456);
//            Client client2 = new Client("Ivan2","Iano1v", "Ivanov0ich","8910997777", "ian@yandex.ru", 15, 123444);
            Employee employee = new Employee("Ivan2","Iano1v", "Ivanov0ich","8910997777", "ian@yandex.ru", 15, "123", "Cleaner");
//            Employee employee1 = new Employee("Ivan2","Iano1v", "Ivanov0ich","8910997777", "ian@yandex.ru", 15, "345", "Admin");

              ComputerClub computerClub = new ComputerClub("123456", "Modcow", "city", "puirbyf", 2, "active", 21);
              Computer computer = new Computer("12345", "Intel", "123", "345", "678", "Activ1");
              Computer computer1 = new Computer("123495", "Intelcore", "00123", "00345", "0678", "Active2");
              Computer computer2 = new Computer("12349521", "Intelcore10", "001213", "003415", "06781", "Active3");
              Computer computer3 = new Computer("123495212", "Intelcore11", "0012300", "003405", "06718", "Active4");
              Package packages = new Package("Пакет на три часа", 300);
              Package packages1 = new Package("Пакет вип", 500);
              Subscription subscription = new Subscription("123456", "20.23.2003");

                clientService.add(client1);
//                clientService.add(client2);
                employeeService.add(employee);
//                employeeService.add(employee1);
              computerClubService.add(computerClub);
              computerService.add(computer);
              computerService.add(computer1);
              computerService.add(computer2);
              computerService.add(computer3);
              packageService.add(packages);
              packageService.add(packages1);
              subscriptionService.add(subscription);

              subscription.setPackageType(packages1);
              computerClub.addComputerToComputerClub(computer);
              computerClub.addComputerToComputerClub(computer1);
              computerClub.addComputerToComputerClub(computer2);
              computerClub.addComputerToComputerClub(computer3);
              computerClub.addSubscriptionToComputerClub(subscription);
              packages.addComputerToPackage(computer);
              packages.addComputerToPackage(computer1);
              packages1.addComputerToPackage(computer2);
              packages1.addComputerToPackage(computer3);
              computer.addPackagesToComputer(packages);
              computer1.addPackagesToComputer(packages);
              computer2.addPackagesToComputer(packages1);
              computer3.addPackagesToComputer(packages1);
              client1.addSubscriptionToClient(subscription);
              employee.addSubscriptionToEmployee(subscription);



              clientService.add(client1);
//                clientService.add(client2);
                employeeService.add(employee);
//                employeeService.add(employee1);
              computerClubService.add(computerClub);
              computerService.add(computer);
              computerService.add(computer1);
              computerService.add(computer2);
              computerService.add(computer3);
              packageService.add(packages);
              packageService.add(packages1);
              subscriptionService.add(subscription);





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

