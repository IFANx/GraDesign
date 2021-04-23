package com.kkxu.demo.mapper;

import com.kkxu.demo.common.domain.Train_Info;
import com.kkxu.demo.common.domain.Train_InfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Train_InfoMapper {
    long countByExample(Train_InfoExample example);

    int deleteByExample(Train_InfoExample example);

    int deleteByPrimaryKey(String trainNo);

    int insert(Train_Info record);

    int insertSelective(Train_Info record);

    List<Train_Info> selectByExample(Train_InfoExample example);

    Train_Info selectByPrimaryKey(String trainNo);

    int updateByExampleSelective(@Param("record") Train_Info record, @Param("example") Train_InfoExample example);

    int updateByExample(@Param("record") Train_Info record, @Param("example") Train_InfoExample example);

    int updateByPrimaryKeySelective(Train_Info record);

    int updateByPrimaryKey(Train_Info record);
}