package com.example.state.s.pattern;

import com.example.state.s.OrderStateAnnotation;
import com.example.state.s.StateEnum;
import com.example.state.s.StatePackage;
import org.reflections.Reflections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class StateContext implements ApplicationContextAware {
    private Map<StateEnum, OrderState> orderStateMap = new HashMap<>();


    /**
     * 实现ApplicationContextAware接口的回调方法，设置上下文环境
     *
     * @param applicationContext
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        Reflections reflections = new Reflections(StatePackage.class);
        Set<Class<?>> classSet = reflections.getTypesAnnotatedWith(OrderStateAnnotation.class);
        for (Class<?> clazz : classSet) {
            OrderState bean = (OrderState) applicationContext.getBean(clazz);

            OrderStateAnnotation annotation = clazz.getAnnotation(OrderStateAnnotation.class);

            orderStateMap.put(annotation.stateEnum(), bean);
        }
    }


    /**
     * 根据指标类型获取对应的实现类
     *
     * @param stateEnum
     * @return
     */
    public OrderState getOrderState(StateEnum stateEnum) {
        if (stateEnum == null) {
            throw new IllegalArgumentException("codeEnum can't be null");
        }

        if (CollectionUtils.isEmpty(orderStateMap)) {
            throw new IllegalArgumentException("strategy map is empty，please check your strategy package path");
        }

        OrderState strategy = orderStateMap.get(stateEnum);

        Assert.notNull(strategy, "can't find AbstractStrategy using {}" + stateEnum.toString());

        return strategy;
    }


}