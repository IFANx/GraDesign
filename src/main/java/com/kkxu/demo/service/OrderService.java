package com.kkxu.demo.service;

import com.kkxu.demo.common.domain.Order_List;

public interface OrderService {
    boolean insertorder(Order_List order_list);

    Integer MaxID();
}
