/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.adapter;

/***
 * 对象适配器模式
 * 适配器
 * 设计符合目标接口的实现
 *  实现的是目标接口
 */
public class Adapter_2 implements Target {
    private Adaptee adaptee;

    public Adapter_2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void a() {
        adaptee.b();
    }
}
