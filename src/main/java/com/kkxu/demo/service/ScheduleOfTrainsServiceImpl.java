package com.kkxu.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkxu.demo.common.domain.Schedule_Of_Trains;
import com.kkxu.demo.common.domain.Schedule_Of_TrainsExample;
import com.kkxu.demo.common.domain.Seat;
import com.kkxu.demo.common.domain.SeatExample;
import com.kkxu.demo.mapper.Schedule_Of_TrainsMapper;
import com.kkxu.demo.mapper.SeatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class ScheduleOfTrainsServiceImpl implements ScheduleOfTrainsService {
    @Autowired
    private Schedule_Of_TrainsMapper schedule_of_trainsMapper;
    @Autowired
    private SeatMapper seatMapper;
    private String seattype = null;
    private int seatcount = 10;
    private int carriageno;
    private String trainno;

    @Override
    public List<Schedule_Of_Trains> listpart() {
        Schedule_Of_TrainsExample schedule_of_trainsExample = new Schedule_Of_TrainsExample();
        schedule_of_trainsExample.setOrderByClause("tarin_no asc,departure_time asc,use_time asc");
        schedule_of_trainsExample.setDistinct(true);
        schedule_of_trainsExample.createCriteria().andDepartureStationIsNotNull().andEndStationIsNotNull().andFromStationLike("北京");
        List<Schedule_Of_Trains> trainlist = schedule_of_trainsMapper.selectByExample(schedule_of_trainsExample);
//        int i = 0;
////        Seat seat=new Seat();
////        while (trainlist.get(i) != null) {
////            trainno = trainlist.get(i).getTarinNo();
////            int k = 0;
////            seat.setSeatCount(10);
////            seat.setTrainNo(trainno);
////            if (trainlist.get(i).getBusinessSeat() != null) {
////                seat.setSeatType("business_seat");
////                seat.setCarriageNo("a"+trainlist.get(i).getId());
////                seatMapper.insert(seat);
////            }
////            if (trainlist.get(i).getFirstClassSeats() != null) {
////                seat.setSeatType("first_class_seats");
////                seat.setCarriageNo("b"+trainlist.get(i).getId());
////                seatMapper.insert(seat);
////            }if (trainlist.get(i).getSecondClassSeats() != null) {
////                seat.setSeatType("second_class_seats");
////                seat.setCarriageNo("c"+trainlist.get(i).getId());
////                seatMapper.insert(seat);
////            }if (trainlist.get(i).getHighGradeSoftBerth() != null) {
////                seat.setSeatType("high_grade_soft");
////                seat.setCarriageNo("d"+trainlist.get(i).getId());
////                seatMapper.insert(seat);
////            }if (trainlist.get(i).getSoftBedFirstClassBed() != null) {
////                seat.setSeatType("soft_bed_first_bed");
////                seat.setCarriageNo("e"+trainlist.get(i).getId());
////                seatMapper.insert(seat);
////            }if (trainlist.get(i).getHardSeat() != null) {
////                seat.setSeatType("hard_seat");
////                seat.setCarriageNo("f"+trainlist.get(i).getId());
////                seatMapper.insert(seat);
////            }if (trainlist.get(i).getSeatless() != null) {
////                seat.setSeatType("seat_less");
////                seat.setCarriageNo("g"+trainlist.get(i).getId());
////                seatMapper.insert(seat);
////            }
////            i++;
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
        schedule_of_trainsExample.createCriteria().andDepartureStationLike("%" + departure_station + "%").andEndStationLike("%" + end_station + "%");
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
        SeatExample seatExample = new SeatExample();
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
        schedule_of_trainsExample.createCriteria().andDepartureStationLike("%" + departure_station + "%").andEndStationLike("%" + end_station + "%");
        schedule_of_trainsExample.setOrderByClause("tarin_no asc,departure_time asc,use_time asc ");
        List<Schedule_Of_Trains> trains = schedule_of_trainsMapper.selectByExample(schedule_of_trainsExample);
        return trains;
    }

    @Override
    public PageInfo<Schedule_Of_Trains> findtrains(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        Schedule_Of_TrainsExample schedule_of_trainsExample = new Schedule_Of_TrainsExample();
        schedule_of_trainsExample.setOrderByClause("tarin_no asc,departure_time asc,use_time asc");
        List<Schedule_Of_Trains> schedule_of_trains = schedule_of_trainsMapper.selectByExample(schedule_of_trainsExample);
        PageInfo<Schedule_Of_Trains> trainsPageInfo = new PageInfo<>(schedule_of_trains);
        return trainsPageInfo;
    }

    @Override
    public List<Schedule_Of_Trains> fromstation(String from_station) {
        Schedule_Of_TrainsExample schedule_of_trainsExample = new Schedule_Of_TrainsExample();
//        schedule_of_trainsExample.setDistinct(true);
        schedule_of_trainsExample.createCriteria().andToStationLike("%" + from_station + "%");
        List<Schedule_Of_Trains> trains = schedule_of_trainsMapper.selectByExample(schedule_of_trainsExample);
        return trains;
    }
    @Override
    public List<Schedule_Of_Trains> tostation(String to_station) {
        Schedule_Of_TrainsExample schedule_of_trainsExample = new Schedule_Of_TrainsExample();
//        schedule_of_trainsExample.setDistinct(true);
        schedule_of_trainsExample.createCriteria().andToStationLike("%" + to_station + "%");
        List<Schedule_Of_Trains> trains = schedule_of_trainsMapper.selectByExample(schedule_of_trainsExample);
        return trains;
    }

    @Override
    public PageInfo<Schedule_Of_Trains> scheduleOfTrainsbydepartureandend(String departure_station, String end_station, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        Schedule_Of_TrainsExample schedule_of_trainsExample = new Schedule_Of_TrainsExample();
        schedule_of_trainsExample.setOrderByClause("tarin_no asc,departure_time asc,use_time asc");
        schedule_of_trainsExample.createCriteria().andDepartureStationLike("%" + departure_station + "%").andToStationLike("%" + end_station + "%");
        List<Schedule_Of_Trains> schedule_of_trains = schedule_of_trainsMapper.selectByExample(schedule_of_trainsExample);
        PageInfo<Schedule_Of_Trains> trainsPageInfo = new PageInfo<>(schedule_of_trains);
        return trainsPageInfo;
    }
}
