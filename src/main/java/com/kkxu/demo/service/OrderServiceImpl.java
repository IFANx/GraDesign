package com.kkxu.demo.service;

import com.kkxu.demo.common.domain.Order_List;
import com.kkxu.demo.mapper.Order_ListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private Order_ListMapper order_listMapper;
    @Override
    public boolean insertorder(Order_List order_list) {
        int insert = order_listMapper.insertSelective(order_list);
        if(insert!=0)
        return true;
        return false;
    }

    @Override
    public Integer MaxID() {
        int MaxID=order_listMapper.selectMaxID();
        return MaxID;
    }
}
