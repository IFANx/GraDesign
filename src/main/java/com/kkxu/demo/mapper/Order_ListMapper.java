package com.kkxu.demo.mapper;

import com.kkxu.demo.common.domain.Order_List;
import com.kkxu.demo.common.domain.Order_ListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Order_ListMapper {
    long countByExample(Order_ListExample example);

    int deleteByExample(Order_ListExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order_List record);

    int insertSelective(Order_List record);

    List<Order_List> selectByExample(Order_ListExample example);

    Order_List selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Order_List record, @Param("example") Order_ListExample example);

    int updateByExample(@Param("record") Order_List record, @Param("example") Order_ListExample example);

    int updateByPrimaryKeySelective(Order_List record);

    int updateByPrimaryKey(Order_List record);
}