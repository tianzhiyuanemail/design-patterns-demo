/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.strategy.s;

import org.springframework.stereotype.Service;

@Service
@OrderTypeAnnotation(orderType = OrderTypeEnum.INSTANT)
public class InstantOrderStrategy implements AbstractStrategy {
    @Override
    public void process(OrderDTO orderDTO) {
        System.out.println("取消即时订单");
    }
}