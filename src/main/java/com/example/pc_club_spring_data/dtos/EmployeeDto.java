package com.example.pc_club_spring_data.dtos;


public class EmployeeDto {
    private int employeeId;
    private String contractNumber;
    private String position;
    private FullHumanDto humanInfo;

    public EmployeeDto(int employeeId, String contractNumber, String position, FullHumanDto humanInfo) {
        this.employeeId = employeeId;
        this.contractNumber = contractNumber;
        this.position = position;
        this.humanInfo = humanInfo;
    }

    public EmployeeDto() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public FullHumanDto getHuman() {
        return humanInfo;
    }

    public void setHuman(FullHumanDto humanInfo) {
        this.humanInfo = humanInfo;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "employeeId=" + employeeId +
                ", contractNumber='" + contractNumber + '\'' +
                ", position='" + position + '\'' +
                ", human=" + humanInfo +
                '}';
    }
}
