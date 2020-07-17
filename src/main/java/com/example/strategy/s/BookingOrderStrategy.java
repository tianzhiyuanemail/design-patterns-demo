/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.strategy.s;

import org.springframework.stereotype.Service;

@Service
@OrderTypeAnnotation(orderType = OrderTypeEnum.BOOKING)
public class BookingOrderStrategy implements AbstractStrategy {
    @Override
    public void process(OrderDTO orderDTO) {
        System.out.println("取消预约订单");
    }
}