package com.kkxu.demo.common.domain;

public class Train_Parking_StationKey {
    private String trainNo;

    private String stationNo;

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo == null ? null : trainNo.trim();
    }

    public String getStationNo() {
        return stationNo;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo == null ? null : stationNo.trim();
    }
}