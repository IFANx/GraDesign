package com.kkxu.demo.common.domain;

public class SeatKey {
    private String trainNo;

    private String carriageNo;

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo == null ? null : trainNo.trim();
    }

    public String getCarriageNo() {
        return carriageNo;
    }

    public void setCarriageNo(String carriageNo) {
        this.carriageNo = carriageNo == null ? null : carriageNo.trim();
    }
}