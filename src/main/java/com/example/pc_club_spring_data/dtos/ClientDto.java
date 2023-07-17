package com.example.pc_club_spring_data.dtos;

public class ClientDto {
    private int clientId;
    private int accountScore;
    private HumanDto humanInfo;

    public ClientDto(int clientId, int accountScore, HumanDto humanInfo) {
        this.clientId = clientId;
        this.accountScore = accountScore;
        this.humanInfo = humanInfo;
    }

    public ClientDto() {
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getAccountScore() {
        return accountScore;
    }

    public void setAccountScore(int accountScore) {
        this.accountScore = accountScore;
    }

    public HumanDto getHumanInfo() {
        return humanInfo;
    }

    public void setHumanInfo(HumanDto humanInfo) {
        this.humanInfo = humanInfo;
    }

    @Override
    public String toString() {
        return "ClientDto{" +
                "clientId=" + clientId +
                ", accountScore=" + accountScore +
                ", humanInfo=" + humanInfo +
                '}';
    }
}
