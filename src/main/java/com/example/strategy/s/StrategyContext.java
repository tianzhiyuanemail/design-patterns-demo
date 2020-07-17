/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.strategy.s;

import org.reflections.Reflections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author baidu
 */
@Service
public class StrategyContext implements ApplicationContextAware {
    private Map<com.example.strategy.s.OrderTypeEnum, AbstractStrategy> strategyMap = new HashMap<>();


    /**
     * 实现ApplicationContextAware接口的回调方法，设置上下文环境
     *
     * @param applicationContext
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        postProcessBeanFactory(applicationContext);
    }

    /***
     * spring bean 初始化完成后调用
     */
    public void postProcessBeanFactory(ApplicationContext applicationContext) {
        Reflections reflections = new Reflections(StrategyPackage.class);
        Set<Class<?>> classSet = reflections.getTypesAnnotatedWith(OrderTypeAnnotation.class);
        for (Class<?> clazz : classSet) {
            AbstractStrategy bean = (AbstractStrategy) applicationContext.getBean(clazz);

            OrderTypeAnnotation annotation = clazz.getAnnotation(OrderTypeAnnotation.class);

            strategyMap.put(annotation.orderType(), bean);
        }
    }

    /**
     * 根据指标类型获取对应的实现类
     *
     * @param orderTypeEnum
     * @return
     */
    public AbstractStrategy getStrategy(OrderTypeEnum orderTypeEnum) {
        if (orderTypeEnum == null) {
            throw new IllegalArgumentException("codeEnum can't be null");
        }

        if (CollectionUtils.isEmpty(strategyMap)) {
            throw new IllegalArgumentException("strategy map is empty，please check your strategy package path");
        }

        AbstractStrategy strategy = strategyMap.get(orderTypeEnum);

        Assert.notNull(strategy, "can't find AbstractStrategy using {}" + orderTypeEnum.toString());

        return strategy;
    }


}