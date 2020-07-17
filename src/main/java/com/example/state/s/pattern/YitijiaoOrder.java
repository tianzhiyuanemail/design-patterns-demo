package com.example.state.s.pattern;

import com.example.state.s.OrderStateAnnotation;
import com.example.state.s.StateEnum;
import org.springframework.stereotype.Component;

@Component
@OrderStateAnnotation(stateEnum = StateEnum.yitijiao)
public class YitijiaoOrder extends OrderState {
    @Override
    public StateEnum updateOrder() {
        System.out.println("已提交状态：可以修改订单数量");
        return StateEnum.yitijiao;
    }

    @Override
    public StateEnum payOrder() {
        System.out.println("已提交状态：可以支付");
        return StateEnum.yizhifu;
    }

    @Override
    public StateEnum forbackOrder() {
        System.out.println("已提交状态 未支付：不可以退款");
        return StateEnum.yitijiao;
    }
}