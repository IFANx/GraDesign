package com.kkxu.demo.common.domain;

public class Train_Info {
    private String trainNo;

    private String trainNumber;

    private String trainType;

    private Integer trainCarriages;

    private String trainStartStation;

    private String trainEndStation;

    private String trainStartTime;

    private String trainEndTime;

    private String trainArriveDay;

    private String trainRuningTime;

    private String trainRunType;

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo == null ? null : trainNo.trim();
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber == null ? null : trainNumber.trim();
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType == null ? null : trainType.trim();
    }

    public Integer getTrainCarriages() {
        return trainCarriages;
    }

    public void setTrainCarriages(Integer trainCarriages) {
        this.trainCarriages = trainCarriages;
    }

    public String getTrainStartStation() {
        return trainStartStation;
    }

    public void setTrainStartStation(String trainStartStation) {
        this.trainStartStation = trainStartStation == null ? null : trainStartStation.trim();
    }

    public String getTrainEndStation() {
        return trainEndStation;
    }

    public void setTrainEndStation(String trainEndStation) {
        this.trainEndStation = trainEndStation == null ? null : trainEndStation.trim();
    }

    public String getTrainStartTime() {
        return trainStartTime;
    }

    public void setTrainStartTime(String trainStartTime) {
        this.trainStartTime = trainStartTime == null ? null : trainStartTime.trim();
    }

    public String getTrainEndTime() {
        return trainEndTime;
    }

    public void setTrainEndTime(String trainEndTime) {
        this.trainEndTime = trainEndTime == null ? null : trainEndTime.trim();
    }

    public String getTrainArriveDay() {
        return trainArriveDay;
    }

    public void setTrainArriveDay(String trainArriveDay) {
        this.trainArriveDay = trainArriveDay == null ? null : trainArriveDay.trim();
    }

    public String getTrainRuningTime() {
        return trainRuningTime;
    }

    public void setTrainRuningTime(String trainRuningTime) {
        this.trainRuningTime = trainRuningTime == null ? null : trainRuningTime.trim();
    }

    public String getTrainRunType() {
        return trainRunType;
    }

    public void setTrainRunType(String trainRunType) {
        this.trainRunType = trainRunType == null ? null : trainRunType.trim();
    }
}