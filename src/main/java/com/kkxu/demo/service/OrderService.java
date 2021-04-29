package com.kkxu.demo.service;

import com.github.pagehelper.PageInfo;
import com.kkxu.demo.common.domain.Order_List;

import java.util.List;

public interface OrderService {
    boolean insertorder(Order_List order_list);

    Integer MaxID();

    List<Order_List> lookorder(String  userPhonenumber);

    void deleteorder(Integer maxID);

    PageInfo findorder(String userPhonenumber, int pageNo, int pageSize);

    void updateorder(Integer orderId);

    PageInfo payedorder(String userPhoneNumber, int pageNo, int pageSize);

    PageInfo notpayedorder(String userPhoneNumber, int pageNo, int pageSize);
}
