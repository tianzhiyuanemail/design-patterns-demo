package com.example.state.s.pattern;

import com.example.state.s.OrderStateAnnotation;
import com.example.state.s.StateEnum;
import org.springframework.stereotype.Component;

@Component
@OrderStateAnnotation(stateEnum = StateEnum.yituikuan)
public class YituikuanOrder extends OrderState {
    @Override
    public StateEnum updateOrder() {
        System.out.println("已退款状态：不可以修改订单数量");
        return StateEnum.yituikuan;
    }

    @Override
    public StateEnum payOrder() {
        System.out.println("已退款状态：不可以重复支付");
        return StateEnum.yituikuan;
    }

    @Override
    public StateEnum forbackOrder() {
        System.out.println("已退款状态：不可以重复退款");
        return StateEnum.yituikuan;
    }
}