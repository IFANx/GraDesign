package com.kkxu.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkxu.demo.common.domain.Seat;
import com.kkxu.demo.common.domain.SeatExample;
import com.kkxu.demo.mapper.SeatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {
    @Autowired
    private SeatMapper seatMapper;
    @Override
    public List<Seat> gettseatinfobyid(String train_id) {
        SeatExample seatExample =new SeatExample();
        seatExample.createCriteria().andTrainNoEqualTo(train_id);
        List<Seat> seats = seatMapper.selectByExample(seatExample);
        return seats;
    }

    @Override
    public PageInfo findseats(String train_no, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        SeatExample seatExample =new SeatExample();
        seatExample.createCriteria().andTrainNoEqualTo(train_no);
        List<Seat> seats = seatMapper.selectByExample(seatExample);
        PageInfo<Seat> seatPageInfo=new PageInfo<>(seats);
        return seatPageInfo;
    }
}
