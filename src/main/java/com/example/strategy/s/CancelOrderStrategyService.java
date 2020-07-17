/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.strategy.s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CancelOrderStrategyService {

    @Autowired
    private StrategyContext context;

    @RequestMapping("/a")
    public void process() {
        OrderTypeEnum orderTypeEnum = OrderTypeEnum.BOOKING;
        AbstractStrategy strategy = context.getStrategy(orderTypeEnum);
        strategy.process(new OrderDTO());
    }
}