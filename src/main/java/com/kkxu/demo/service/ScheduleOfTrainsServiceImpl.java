package com.kkxu.demo.service;

import com.kkxu.demo.common.domain.Schedule_Of_Trains;
import com.kkxu.demo.common.domain.Schedule_Of_TrainsExample;
import com.kkxu.demo.common.domain.Seat;
import com.kkxu.demo.common.domain.SeatExample;
import com.kkxu.demo.mapper.Schedule_Of_TrainsMapper;
import com.kkxu.demo.mapper.SeatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.List;

@Service
public class ScheduleOfTrainsServiceImpl implements ScheduleOfTrainsService{
    @Autowired
    private Schedule_Of_TrainsMapper schedule_of_trainsMapper;
    @Autowired
    private SeatMapper seatMapper;
    @Override
    public List<Schedule_Of_Trains> listpart() {
        Schedule_Of_TrainsExample schedule_of_trainsExample = new Schedule_Of_TrainsExample();
        schedule_of_trainsExample.setOrderByClause("tarin_no asc,departure_time asc,use_time asc");
        schedule_of_trainsExample.setDistinct(true);
        schedule_of_trainsExample.createCriteria().andDepartureStationIsNotNull().andEndStationIsNotNull();
        List<Schedule_Of_Trains> trainlist=schedule_of_trainsMapper.selectByExample(schedule_of_trainsExample);
        return trainlist;
    }

    @Override
    public List<Schedule_Of_Trains> Trainsbytrain_number(String train_number) {
        Schedule_Of_TrainsExample schedule_of_trainsExample = new Schedule_Of_TrainsExample();
        schedule_of_trainsExample.setOrderByClause("tarin_no asc,departure_time asc,use_time asc");
        schedule_of_trainsExample.createCriteria().andTrainNumberEqualTo(train_number);
        List<Schedule_Of_Trains> schedule_of_trains = schedule_of_trainsMapper.selectByExample(schedule_of_trainsExample);
        return schedule_of_trains;
    }

    @Override
    public List<Schedule_Of_Trains> Trainsbybydepartureandend(String departure_station, String end_station) {
        Schedule_Of_TrainsExample schedule_of_trainsExample = new Schedule_Of_TrainsExample();
        schedule_of_trainsExample.setOrderByClause("tarin_no asc,departure_time asc,use_time asc");
        schedule_of_trainsExample.createCriteria().andDepartureStationLike("%"+departure_station+"%").andEndStationLike("%"+end_station+"%");
        List<Schedule_Of_Trains> schedule_of_trains = schedule_of_trainsMapper.selectByExample(schedule_of_trainsExample);
        return schedule_of_trains;
    }

    @Override
    public List<Schedule_Of_Trains> Trainsbytrain_id(int train_id) {
        Schedule_Of_TrainsExample schedule_of_trainsExample = new Schedule_Of_TrainsExample();
        schedule_of_trainsExample.setOrderByClause("tarin_no asc,departure_time asc,use_time asc");
        schedule_of_trainsExample.createCriteria().andIdEqualTo(train_id);
        List<Schedule_Of_Trains> schedule_of_trains = schedule_of_trainsMapper.selectByExample(schedule_of_trainsExample);
        return schedule_of_trains;
    }

    @Override
    public List<Seat> seatTrainsbyno(String train_no) {
        SeatExample seatExample=new SeatExample();
        seatExample.setOrderByClause("seat_count asc");
        seatExample.createCriteria().andTrainNoEqualTo(train_no);
        List<Seat> seats = seatMapper.selectByExample(seatExample);
        return seats;
    }

    @Override
    public List<Schedule_Of_Trains> selectbytrainno(String train_no) {
        Schedule_Of_TrainsExample schedule_of_trainsExample = new Schedule_Of_TrainsExample();
        schedule_of_trainsExample.createCriteria().andTarinNoEqualTo(train_no);
        List<Schedule_Of_Trains> trains = schedule_of_trainsMapper.selectByExample(schedule_of_trainsExample);
        return trains;
    }

    @Override
    public List<Schedule_Of_Trains> TrainPassBy(String departure_station, String end_station) {
        Schedule_Of_TrainsExample schedule_of_trainsExample = new Schedule_Of_TrainsExample();
        schedule_of_trainsExample.createCriteria().andDepartureStationLike("%"+departure_station+"%").andEndStationLike("%"+end_station+"%");
        schedule_of_trainsExample.setOrderByClause("tarin_no asc,departure_time asc,use_time asc ");
        List<Schedule_Of_Trains> trains =schedule_of_trainsMapper.selectByExample(schedule_of_trainsExample);
        return trains;
    }
}
