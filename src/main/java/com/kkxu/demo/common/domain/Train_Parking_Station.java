package com.kkxu.demo.common.domain;

public class Train_Parking_Station extends Train_Parking_StationKey {
    private String trainNumber;

    private String arriveDayStr;

    private String arriveTime;

    private String startTime;

    private String runningTime;

    private String stationName;

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber == null ? null : trainNumber.trim();
    }

    public String getArriveDayStr() {
        return arriveDayStr;
    }

    public void setArriveDayStr(String arriveDayStr) {
        this.arriveDayStr = arriveDayStr == null ? null : arriveDayStr.trim();
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime == null ? null : arriveTime.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime == null ? null : runningTime.trim();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }
}