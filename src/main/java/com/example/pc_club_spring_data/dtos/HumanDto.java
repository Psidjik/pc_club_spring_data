package com.example.pc_club_spring_data.dtos;



public class HumanDto {
    private int humanId;
    private String name;
    private String surname;
    private String otchestvo;
    private String phoneNumber;
    private String email;
    private int age;

    public HumanDto(int humanId, String name, String surname, String otchestvo, String phoneNumber, String email, int age) {
        this.humanId = humanId;
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
    }

    public int getHumanId() {
        return humanId;
    }

    public void setHumanId(int humanId) {
        this.humanId = humanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HumanDto{" +
                "humanId=" + humanId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", otchestvo='" + otchestvo + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}