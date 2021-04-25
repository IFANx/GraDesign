package com.kkxu.demo.service;

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
}
