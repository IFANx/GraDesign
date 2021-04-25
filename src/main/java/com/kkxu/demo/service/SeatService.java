package com.kkxu.demo.service;

import com.kkxu.demo.common.domain.Seat;

import java.util.List;

public interface SeatService {

    List<Seat> gettseatinfobyid(String train_id);
}
