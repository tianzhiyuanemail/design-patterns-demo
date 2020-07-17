package com.example.state.s;

import com.example.state.s.pattern.OrderState;
import com.example.state.s.pattern.StateContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;

/***
 * 从db中查询 状态
 */
@Component
public class StateService {

    @Resource
    private StateDao stateDao;


    @Resource
    private StateContext stateContext;


    /***
     * 修改订单数量
     * @return
     */
    public StateEnum updateOrder(String orderId) {
        // 获取订单状态
        StateEnum stateEnum = stateDao.get();

        // 根据当前订单状态 拿到订单状态可操作的实例
        OrderState orderState = stateContext.getOrderState(stateEnum);
        StateEnum anEnum = orderState.updateOrder();

        return anEnum;
    }


    /***
     * 支付订单
     * @return
     */
    public StateEnum payOrder(String orderId) {

        // 获取订单状态
        StateEnum stateEnum = stateDao.get();

        // 根据当前订单状态 拿到订单状态可操作的实例
        OrderState orderState = stateContext.getOrderState(stateEnum);
        StateEnum anEnum = orderState.payOrder();

        return anEnum;
    }

    /***
     * 退货
     * @return
     */
    public StateEnum forbackOrder(String orderId) {

        // 获取订单状态
        StateEnum stateEnum = stateDao.get();

        // 根据当前订单状态 拿到订单状态可操作的实例
        OrderState orderState = stateContext.getOrderState(stateEnum);
        StateEnum anEnum = orderState.forbackOrder();

        return anEnum;
    }


}