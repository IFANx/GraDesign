package com.kkxu.demo.common.domain;

public class Passenger {
    private String passengerPhoneNumber;

    private String userPhoneNumber;

    private String passengerRealName;

    private String passengerIdNumber;

    private Integer passengerType;

    private String passengerAddress;

    public String getPassengerPhoneNumber() {
        return passengerPhoneNumber;
    }

    public void setPassengerPhoneNumber(String passengerPhoneNumber) {
        this.passengerPhoneNumber = passengerPhoneNumber == null ? null : passengerPhoneNumber.trim();
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber == null ? null : userPhoneNumber.trim();
    }

    public String getPassengerRealName() {
        return passengerRealName;
    }

    public void setPassengerRealName(String passengerRealName) {
        this.passengerRealName = passengerRealName == null ? null : passengerRealName.trim();
    }

    public String getPassengerIdNumber() {
        return passengerIdNumber;
    }

    public void setPassengerIdNumber(String passengerIdNumber) {
        this.passengerIdNumber = passengerIdNumber == null ? null : passengerIdNumber.trim();
    }

    public Integer getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(Integer passengerType) {
        this.passengerType = passengerType;
    }

    public String getPassengerAddress() {
        return passengerAddress;
    }

    public void setPassengerAddress(String passengerAddress) {
        this.passengerAddress = passengerAddress == null ? null : passengerAddress.trim();
    }
}