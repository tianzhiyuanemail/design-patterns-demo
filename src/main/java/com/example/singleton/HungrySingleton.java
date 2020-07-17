/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.singleton;

/***
 * 饿汉模式
 *
 * 对象在初始化时被创建在方法区中
 *
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    public static HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }

    private HungrySingleton (){}

}
