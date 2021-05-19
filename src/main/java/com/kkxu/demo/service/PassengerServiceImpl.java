package com.kkxu.demo.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkxu.demo.common.domain.Passenger;
import com.kkxu.demo.common.domain.PassengerExample;
import com.kkxu.demo.mapper.PassengerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    private PassengerMapper passengerMapper;

    @Override
    public List<Passenger> selectbyuserphone(String userPhoneNumber) {
        PassengerExample passengerExample=new PassengerExample();
        passengerExample.createCriteria().andUserPhoneNumberEqualTo(userPhoneNumber);
        List<Passenger> passengers = passengerMapper.selectByExample(passengerExample);
        return passengers;
    }

    @Override
    public void deletePassengerByIdNumber(Passenger passenger) {
        PassengerExample passengerExample =new PassengerExample();
        passengerExample.createCriteria().andPassengerIdNumberEqualTo(passenger.getPassengerIdNumber());
        passengerMapper.deleteByExample(passengerExample);
    }

    @Override
    public PageInfo<Passenger> findPassengers(String userPhoneNumber, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        PassengerExample passengerExample=new PassengerExample();
        passengerExample.createCriteria().andUserPhoneNumberEqualTo(userPhoneNumber);
        List<Passenger> passengers = passengerMapper.selectByExample(passengerExample);
        PageInfo<Passenger> passengerPageInfo = new PageInfo<>(passengers);
        return passengerPageInfo;
    }

    @Override
    public void deletePassengerById(String passengerPhoneNumber) {
        passengerMapper.deleteByPrimaryKey(passengerPhoneNumber);
    }

    @Override
    public void deletePassengersByIdnumbers(List<String> userIdnumbers) {
            passengerMapper.deletePassengersByIds(userIdnumbers);
    }

    @Override
    public void addpassenger(Passenger passenger) {
        passengerMapper.insert(passenger);
    }

    @Override
    public boolean duplicate(String passengerPhoneNumber) {
        Passenger passenger = passengerMapper.selectByPrimaryKey(passengerPhoneNumber);
        if(passenger!=null) return true;
        return false;
    }


}
