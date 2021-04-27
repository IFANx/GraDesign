package com.kkxu.demo.common.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Order_List {
    private Integer orderId;

    private String userPhoneNumber;

    private String passengerPhoneNumber;

    private String passengerIdNumber;

    private String trainNo;

    private String startStationNo;

    private String startStationName;

    private String endStationNo;

    private String endStationName;

    private String carriageNo;

    private String seatNo;

    private String orderMoney;

    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date orderCreateTime;

    private String orderStatus;

    private Date trainStartDate;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber == null ? null : userPhoneNumber.trim();
    }

    public String getPassengerPhoneNumber() {
        return passengerPhoneNumber;
    }

    public void setPassengerPhoneNumber(String passengerPhoneNumber) {
        this.passengerPhoneNumber = passengerPhoneNumber == null ? null : passengerPhoneNumber.trim();
    }

    public String getPassengerIdNumber() {
        return passengerIdNumber;
    }

    public void setPassengerIdNumber(String passengerIdNumber) {
        this.passengerIdNumber = passengerIdNumber == null ? null : passengerIdNumber.trim();
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo == null ? null : trainNo.trim();
    }

    public String getStartStationNo() {
        return startStationNo;
    }

    public void setStartStationNo(String startStationNo) {
        this.startStationNo = startStationNo == null ? null : startStationNo.trim();
    }

    public String getStartStationName() {
        return startStationName;
    }

    public void setStartStationName(String startStationName) {
        this.startStationName = startStationName == null ? null : startStationName.trim();
    }

    public String getEndStationNo() {
        return endStationNo;
    }

    public void setEndStationNo(String endStationNo) {
        this.endStationNo = endStationNo == null ? null : endStationNo.trim();
    }

    public String getEndStationName() {
        return endStationName;
    }

    public void setEndStationName(String endStationName) {
        this.endStationName = endStationName == null ? null : endStationName.trim();
    }

    public String getCarriageNo() {
        return carriageNo;
    }

    public void setCarriageNo(String carriageNo) {
        this.carriageNo = carriageNo == null ? null : carriageNo.trim();
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo == null ? null : seatNo.trim();
    }

    public String getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(String orderMoney) {
        this.orderMoney = orderMoney == null ? null : orderMoney.trim();
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Date getTrainStartDate() {
        return trainStartDate;
    }

    public void setTrainStartDate(Date trainStartDate) {
        this.trainStartDate = trainStartDate;
    }
}