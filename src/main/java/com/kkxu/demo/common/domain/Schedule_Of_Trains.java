package com.kkxu.demo.common.domain;

public class Schedule_Of_Trains {
    private Integer id;

    private String tarinNo;

    private String trainNumber;

    private String departureStation;

    private String endStation;

    private String fromStation;

    private String toStation;

    private String departureTime;

    private String arrivalTime;

    private String useTime;

    private String businessSeat;

    private String firstClassSeats;

    private String secondClassSeats;

    private String highGradeSoftBerth;

    private String softBedFirstClassBed;

    private String motorTrainBed;

    private String hardSecondClassBed;

    private String softSeats;

    private String hardSeat;

    private String seatless;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTarinNo() {
        return tarinNo;
    }

    public void setTarinNo(String tarinNo) {
        this.tarinNo = tarinNo == null ? null : tarinNo.trim();
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber == null ? null : trainNumber.trim();
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation == null ? null : departureStation.trim();
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation == null ? null : endStation.trim();
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation == null ? null : fromStation.trim();
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation == null ? null : toStation.trim();
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime == null ? null : departureTime.trim();
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime == null ? null : arrivalTime.trim();
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime == null ? null : useTime.trim();
    }

    public String getBusinessSeat() {
        return businessSeat;
    }

    public void setBusinessSeat(String businessSeat) {
        this.businessSeat = businessSeat == null ? null : businessSeat.trim();
    }

    public String getFirstClassSeats() {
        return firstClassSeats;
    }

    public void setFirstClassSeats(String firstClassSeats) {
        this.firstClassSeats = firstClassSeats == null ? null : firstClassSeats.trim();
    }

    public String getSecondClassSeats() {
        return secondClassSeats;
    }

    public void setSecondClassSeats(String secondClassSeats) {
        this.secondClassSeats = secondClassSeats == null ? null : secondClassSeats.trim();
    }

    public String getHighGradeSoftBerth() {
        return highGradeSoftBerth;
    }

    public void setHighGradeSoftBerth(String highGradeSoftBerth) {
        this.highGradeSoftBerth = highGradeSoftBerth == null ? null : highGradeSoftBerth.trim();
    }

    public String getSoftBedFirstClassBed() {
        return softBedFirstClassBed;
    }

    public void setSoftBedFirstClassBed(String softBedFirstClassBed) {
        this.softBedFirstClassBed = softBedFirstClassBed == null ? null : softBedFirstClassBed.trim();
    }

    public String getMotorTrainBed() {
        return motorTrainBed;
    }

    public void setMotorTrainBed(String motorTrainBed) {
        this.motorTrainBed = motorTrainBed == null ? null : motorTrainBed.trim();
    }

    public String getHardSecondClassBed() {
        return hardSecondClassBed;
    }

    public void setHardSecondClassBed(String hardSecondClassBed) {
        this.hardSecondClassBed = hardSecondClassBed == null ? null : hardSecondClassBed.trim();
    }

    public String getSoftSeats() {
        return softSeats;
    }

    public void setSoftSeats(String softSeats) {
        this.softSeats = softSeats == null ? null : softSeats.trim();
    }

    public String getHardSeat() {
        return hardSeat;
    }

    public void setHardSeat(String hardSeat) {
        this.hardSeat = hardSeat == null ? null : hardSeat.trim();
    }

    public String getSeatless() {
        return seatless;
    }

    public void setSeatless(String seatless) {
        this.seatless = seatless == null ? null : seatless.trim();
    }
}