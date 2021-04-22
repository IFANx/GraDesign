package com.kkxu.demo.mapper;

import com.kkxu.demo.common.domain.Train_Parking_Station;
import com.kkxu.demo.common.domain.Train_Parking_StationExample;
import com.kkxu.demo.common.domain.Train_Parking_StationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Train_Parking_StationMapper {
    long countByExample(Train_Parking_StationExample example);

    int deleteByExample(Train_Parking_StationExample example);

    int deleteByPrimaryKey(Train_Parking_StationKey key);

    int insert(Train_Parking_Station record);

    int insertSelective(Train_Parking_Station record);

    List<Train_Parking_Station> selectByExample(Train_Parking_StationExample example);

    Train_Parking_Station selectByPrimaryKey(Train_Parking_StationKey key);

    int updateByExampleSelective(@Param("record") Train_Parking_Station record, @Param("example") Train_Parking_StationExample example);

    int updateByExample(@Param("record") Train_Parking_Station record, @Param("example") Train_Parking_StationExample example);

    int updateByPrimaryKeySelective(Train_Parking_Station record);

    int updateByPrimaryKey(Train_Parking_Station record);
}