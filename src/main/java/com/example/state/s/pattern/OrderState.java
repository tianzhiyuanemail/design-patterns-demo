package com.example.state.s.pattern;

import com.example.state.s.StateEnum;

/**
 * 这里定义订单状态下 所有执行的方法
 */
public abstract class OrderState {

    /***
     * 修改订单数量
     * @return
     */
    public abstract StateEnum updateOrder();

    /***
     * 支付订单
     * @return
     */
    public abstract StateEnum payOrder();

    /***
     * 退货
     * @return
     */
    public abstract StateEnum forbackOrder();


}