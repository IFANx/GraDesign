package com.kkxu.demo.service;

import com.github.pagehelper.PageInfo;
import com.kkxu.demo.common.domain.Schedule_Of_Trains;
import com.kkxu.demo.common.domain.Seat;

import java.util.List;

public interface ScheduleOfTrainsService {
    List<Schedule_Of_Trains> listpart();

    //根据列车号查询列车
    List<Schedule_Of_Trains> Trainsbytrain_number(String train_number);

    List<Schedule_Of_Trains> Trainsbybydepartureandend(String departure_station, String end_station);

    List<Schedule_Of_Trains> Trainsbytrain_id(int train_id);

    //查询当前车次剩余所有位次信息
    List<Seat> seatTrainsbyno(String train_no);

    List<Schedule_Of_Trains> selectbytrainno(String train_no);

    List<Schedule_Of_Trains> TrainPassBy(String departure_station, String end_station);

    PageInfo<Schedule_Of_Trains> findtrains(int pageNo, int pageSize);

    List<Schedule_Of_Trains> fromstation(String from_station);

    PageInfo scheduleOfTrainsbydepartureandend(String departure_station, String end_station, int pageNo, int pageSize);
    //列出所有列车信息
}
