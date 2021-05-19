package com.kkxu.demo.service;

import com.github.pagehelper.PageInfo;
import com.kkxu.demo.common.domain.Passenger;

import java.util.List;

public interface PassengerService {
    List<Passenger> selectbyuserphone(String userPhoneNumber);

    void deletePassengerByIdNumber(Passenger passenger);

    PageInfo<Passenger> findPassengers(String userPhoneNumber, int pageNo, int pageSize);

    void deletePassengerById(String passengerPhoneNumber);

    void deletePassengersByIdnumbers(List<String> userIdnumbers);

    void addpassenger(Passenger passenger);

    boolean duplicate(String passengerPhoneNumber);
}
