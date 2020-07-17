/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.adapter;

/***
 * 类适配器模式
 * 适配器
 * 设计符合目标接口的实现
 * 继承的是适配者 实现的是目标接口
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void a() {
        super.b();
    }
}
