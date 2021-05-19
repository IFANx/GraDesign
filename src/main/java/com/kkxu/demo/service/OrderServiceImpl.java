package com.kkxu.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkxu.demo.common.domain.Order_List;
import com.kkxu.demo.common.domain.Order_ListExample;
import com.kkxu.demo.mapper.Order_ListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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

    @Override
    public List<Order_List> lookorder(String userPhonenumber) {
        Order_ListExample order_listExample = new Order_ListExample();
        order_listExample.createCriteria().andUserPhoneNumberEqualTo(userPhonenumber);
        List<Order_List> order_lists = order_listMapper.selectByExample(order_listExample);
        return order_lists;
    }

    @Override
    public void deleteorder(Integer maxID) {
        order_listMapper.deleteByPrimaryKey(maxID);
    }

    @Override
    public PageInfo findorder(String userPhonenumber, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        Order_ListExample order_listExample=new Order_ListExample();
        order_listExample.setOrderByClause("order_create_time desc");
        order_listExample.createCriteria().andUserPhoneNumberEqualTo(userPhonenumber);
        List<Order_List> order_lists = order_listMapper.selectByExample(order_listExample);
        PageInfo<Order_List> order_listPageInfo =new PageInfo<>(order_lists);
        return order_listPageInfo;
    }

    @Override
    public void updateorder(Integer orderId) {
        Order_List order_list=order_listMapper.selectByPrimaryKey(orderId);
        order_list.setOrderStatus("已支付");
        order_listMapper.updateByPrimaryKey(order_list);
    }

    @Override
    public PageInfo payedorder(String userPhoneNumber, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        Order_ListExample order_listExample=new Order_ListExample();
        order_listExample.setOrderByClause("order_create_time desc");
        order_listExample.createCriteria().andUserPhoneNumberEqualTo(userPhoneNumber).andOrderStatusEqualTo("已支付");
        List<Order_List> order_lists = order_listMapper.selectByExample(order_listExample);
        PageInfo<Order_List> order_listPageInfo =new PageInfo<>(order_lists);
        return order_listPageInfo;
    }
    @Override
    public PageInfo notpayedorder(String userPhoneNumber, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        Order_ListExample order_listExample=new Order_ListExample();
        order_listExample.setOrderByClause("order_create_time desc");
        order_listExample.createCriteria().andUserPhoneNumberEqualTo(userPhoneNumber).andOrderStatusEqualTo("未支付");
        List<Order_List> order_lists = order_listMapper.selectByExample(order_listExample);
        PageInfo<Order_List> order_listPageInfo =new PageInfo<>(order_lists);
        return order_listPageInfo;
    }
}
