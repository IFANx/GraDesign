package com.kkxu.demo.mapper;

import com.kkxu.demo.common.domain.Schedule_Of_Trains;
import com.kkxu.demo.common.domain.Schedule_Of_TrainsExample;
import java.util.List;

import com.kkxu.demo.mapper.Extend.Schedule_Of_TrainsMapperExtend;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Schedule_Of_TrainsMapper extends Schedule_Of_TrainsMapperExtend {
    long countByExample(Schedule_Of_TrainsExample example);

    int deleteByExample(Schedule_Of_TrainsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Schedule_Of_Trains record);

    int insertSelective(Schedule_Of_Trains record);

    List<Schedule_Of_Trains> selectByExample(Schedule_Of_TrainsExample example);

    Schedule_Of_Trains selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Schedule_Of_Trains record, @Param("example") Schedule_Of_TrainsExample example);

    int updateByExample(@Param("record") Schedule_Of_Trains record, @Param("example") Schedule_Of_TrainsExample example);

    int updateByPrimaryKeySelective(Schedule_Of_Trains record);

    int updateByPrimaryKey(Schedule_Of_Trains record);

    List<Schedule_Of_Trains> selectstation(String departure_station, String end_station);
}