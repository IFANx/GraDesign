package com.kkxu.demo.mapper.Extend;

import com.kkxu.demo.common.domain.Schedule_Of_Trains;

import java.util.List;

public interface Schedule_Of_TrainsMapperExtend {
    List<Schedule_Of_Trains> selectstation(String departure_station, String end_station);

}
